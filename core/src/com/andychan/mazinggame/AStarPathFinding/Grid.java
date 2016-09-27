package com.andychan.mazinggame.AStarPathFinding;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.utils.Array;
import com.sun.corba.se.impl.orbutil.graph.GraphImpl;

/**
 * Created by Andy on 9/26/2016.
 */

public class Grid {
    public static GraphImpl generateGraph(TiledMap map){
        Array<Node> nodes = new Array<Node>();

        TiledMapTileLayer tiles = (TiledMapTileLayer)map.getLayers().get(0);
        int mapHeight =
        return null;
    }
}
