package com.example.kevinwu.maze_navigation.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

import com.example.kevinwu.maze_navigation.models.HttpGetRequest;
import com.example.kevinwu.maze_navigation.services.BluetoothService;
import com.example.kevinwu.maze_navigation.views.GameView;
import com.example.kevinwu.maze_navigation.models.Maze;
import com.example.kevinwu.maze_navigation.models.MazeFactory;
import com.example.kevinwu.maze_navigation.models.Item;
import com.example.kevinwu.maze_navigation.models.ItemFactory;
import com.example.kevinwu.maze_navigation.models.Character;
import com.example.kevinwu.maze_navigation.R;

public class Game extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_game);
        ArrayList<Maze> maze = MazeFactory.getMazes(); // creates a maze instance
        ArrayList<Item> item = ItemFactory.getMazeItems(); // creates the list of items in the maze

        // the items are long-lasting, they are not recreated when the game view is recreated
        Character character = new Character();
        String username = Connection.usernameEditText.getText().toString();
        character.setUsername(username);
        // depending on which part of the maze we are in we can create the maze
        // we can have a 5x5 maze. we can have an enum struct
        String url = "http://mazenavigation.herokuapp.com/add/user/" + username;

        HttpGetRequest getRequest = new HttpGetRequest();
        try {
            getRequest.execute(url).get();
        }
        catch (Exception e) {}

        url = "http://mazenavigation.herokuapp.com/clear/items";
        getRequest = new HttpGetRequest();
        try {
            getRequest.execute(url).get();

        }
        catch (Exception e) {}

        url = "http://mazenavigation.herokuapp.com/add/winner/" + username;
        getRequest = new HttpGetRequest();
        try {
            getRequest.execute(url).get();

        }
        catch (Exception e) {}

        url = "http://mazenavigation.herokuapp.com/add/direction/" + character.getUsername() + "/down";

        getRequest = new HttpGetRequest();
        try {
            getRequest.execute(url).get();
        }
        catch (Exception e) {}

        GameView view = new GameView(Game.this, maze, item, character, 0);
        setContentView(view);
    }
}
