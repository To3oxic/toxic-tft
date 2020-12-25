package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Class {
    String name;
    Map<Integer,Integer> combos=new HashMap<Integer, Integer>();
    ArrayList<Champion> champions=new ArrayList<Champion>();

    public Class withoutChampion(Object... value)
    {
        if (this.champions == null || value==null) return this;
        for (Object item : value)
        {
            if (item == null) continue;
            if (item instanceof java.util.Collection)
            {
                for (Object i : (java.util.Collection) item)
                {
                    this.withoutChampion(i);
                }
            }
            else if (item instanceof Class)
            {
                if (this.champions.contains(item))
                {
                    this.champions.remove((Champion) item);
                    ((Champion)item).withoutClass(this);

                }
            }
        }
        return this;
    }

    public Class withChampion(Object... value)
    {
        if(value==null) return this;
        for (Object item : value)
        {
            if (item == null) continue;
            if (item instanceof java.util.Collection)
            {
                for (Object i : (java.util.Collection) item)
                {
                    this.withChampion(i);
                }
            }
            else if (item instanceof Class)
            {
                if (this.champions == null)
                {
                    this.champions = new java.util.ArrayList<Champion>();
                }
                if ( ! this.champions.contains(item))
                {
                    this.champions.add((Champion) item);
                    ((Champion)item).withClass(this);
                }
            }
            else throw new IllegalArgumentException();
        }
        return this;
    }

    public Map<Integer, Integer> getCombos() {
        return combos;
    }
}
