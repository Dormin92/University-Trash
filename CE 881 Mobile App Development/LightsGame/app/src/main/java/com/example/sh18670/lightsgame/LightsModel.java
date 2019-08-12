package com.example.sh18670.lightsgame;

import android.util.Log;

import java.util.Arrays;

public class LightsModel
{
    int [][] grid;
    boolean notStrict = true;
    int n;

    public LightsModel(int n)
    {
        Log.d("Model Construction", "Working here");
        this.n = n;
        grid = new int [n][n];
    }

    public void tryFlip(int i, int j)
    {
        Log.d("Tryflip start", "Working here");
        try
        {
            if(isSwitchOn(i, j) || notStrict) {
                flipLines(i, j);
            }
        }
        catch (Exception e)
        {
            Log.d("Tryflip catch", "Working here");
            //catch block
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            sb.append(Arrays.toString(grid[i]) + "\n");
        }
        return sb.toString();
    }

    boolean isSwitchOn(int i, int j)
    {
        if(grid[i][j] == 1)
            return true;
        else
            return false;
    }

    void flipLines(int i, int j)
    {
        for(int x = 0; x < n; x++)
        {
            if(grid[x][j] == 0)
            {
                grid[x][j] = 1;
            }
            else
            {
                grid[x][j] = 0;
            }
        }
        for (int y = 0; y < n; y++)
        {
            if(grid[i][y] != grid [i][j])
            {
                if(grid[i][y] == 0)
                {
                    grid[i][y] = 1;
                }
                else
                {
                    grid[i][y] = 0;
                }
            }
        }
    }

    boolean isSolved()
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}
