package model;

import java.util.ArrayList;

public class Champion {
    String name;
    String icon;
    ArrayList<Class> classes=new ArrayList<Class>();
    ArrayList<Origin>origins=new ArrayList<Origin>();

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public ArrayList<Origin> getOrigins() {
        return origins;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Champion withClass(Object... value)
    {
        if(value==null) return this;
        for (Object item : value)
        {
            if (item == null) continue;
            if (item instanceof java.util.Collection)
            {
                for (Object i : (java.util.Collection) item)
                {
                    this.withClass(i);
                }
            }
            else if (item instanceof Class)
            {
                if (this.classes == null)
                {
                    this.classes = new java.util.ArrayList<Class>();
                }
                if ( ! this.classes.contains(item))
                {
                    this.classes.add((Class) item);
                    ((Class)item).withChampion(this);
                }
            }
            else throw new IllegalArgumentException();
        }
        return this;
    }
    public Champion withoutClass(Object... value)
    {
        if (this.classes == null || value==null) return this;
        for (Object item : value)
        {
            if (item == null) continue;
            if (item instanceof java.util.Collection)
            {
                for (Object i : (java.util.Collection) item)
                {
                    this.withoutClass(i);
                }
            }
            else if (item instanceof Class)
            {
                if (this.classes.contains(item))
                {
                    this.classes.remove((Class) item);
                    ((Class)item).withoutChampion(this);

                }
            }
        }
        return this;
    }
    public Champion withOrigin(Object... value)
    {
        if(value==null) return this;
        for (Object item : value)
        {
            if (item == null) continue;
            if (item instanceof java.util.Collection)
            {
                for (Object i : (java.util.Collection) item)
                {
                    this.withOrigin(i);
                }
            }
            else if (item instanceof Origin)
            {
                if (this.origins == null)
                {
                    this.origins = new java.util.ArrayList<Origin>();
                }
                if ( ! this.origins.contains(item))
                {
                    this.origins.add((Origin) item);
                    ((Origin)item).withChampion(this);
                }
            }
            else throw new IllegalArgumentException();
        }
        return this;
    }
    public Champion withoutOrigins(Object... value)
    {
        if (this.classes == null || value==null) return this;
        for (Object item : value)
        {
            if (item == null) continue;
            if (item instanceof java.util.Collection)
            {
                for (Object i : (java.util.Collection) item)
                {
                    this.withoutOrigins(i);
                }
            }
            else if (item instanceof Class)
            {
                if (this.origins.contains(item))
                {
                    this.origins.remove((Origin) item);
                    ((Origin)item).withoutChampion(null);

                }
            }
        }
        return this;
    }
}
