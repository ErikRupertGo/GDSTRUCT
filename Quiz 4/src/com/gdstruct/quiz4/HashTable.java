package com.gdstruct.quiz4;

public class HashTable {
    private StoredPlayer[] hashtable;

    public HashTable()
    {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey))
        {
            int stopper = hashedKey;

            if (hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopper)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey))
        {
            System.out.println("Element Exists at " + hashedKey);
        }
        else
        {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashed = findKey(key);
        if (hashed == -1)
        {
            return null;
        }
        return hashtable[hashed].value;
    }

    private int findKey(String key) {
        int hashed = hashKey(key);
        if (hashtable[hashKey(key)] != null && hashtable[hashed].key.equals(key))
        {
            return hashed;
        }

        //probe
        int stopper = hashed;
        if (hashed == hashtable.length - 1) {
            hashed = 0;
        } else {
            hashed++;
        }
        while (hashtable[hashed] != null && hashed != stopper && !hashtable[hashed].key.equals(key)) {
            hashed = (hashed + 1) % hashtable.length;
        }
        if (hashtable[hashed] != null && hashtable[hashed].key.equals(key))
        {
            return hashed;
        }
        return -1;

    }

    public void remove(String key)
    {
        int hashed = findKey(key);//bruh lol
        if (hashed == -1)
        {
            System.out.println("Cannot find element");
        } else {
            hashtable[hashed] = null;
        }
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printTable()
    {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(i + " " + hashtable[i]);
        }
    }
}
