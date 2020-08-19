package lu.uni.intro2prog.exam.task1;

import java.util.ArrayList;

/**
 * Class representing a Storage containing Containers
 */
public class Storage {

    /**
     * List of 'Container' objects
     */
    private final ArrayList<Container> mListContainer;


    /**
     * Constructor
     */
    public Storage() {
        mListContainer = new ArrayList<Container>();
    }

    /**
     * Method to add a Container object
     *
     * @param e the Container object
     */
    public void add(Container e) {
        mListContainer.add(e);
    }

    /**
     * Method to calculate the sum of all Containers' volume
     *
     * @return the sum of all Containers' volume
     */
    public int getTotalCapacity() {

        int volume = 0;

        for (Container container : mListContainer) {
            volume = +volume + (container.getHeight() * container.getLength() * container.getWidth());
        }

        return volume;
    }

    /**
     * Method inherited from 'Object' class. Used for comparing the volume between 2 Storage
     *
     * @param obj an Object (It can be a 'Storage' object or another type)
     * @return true if The 2 objects have the same volume, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // If obj has the same reference than 'this'
        if (this == obj)
            return true;

        // If obj is not an instantiation of Container class
        if (!(obj instanceof Storage))
            return false;

        // If these different references has the same volume
        Storage other = (Storage) obj;
        return this.getTotalCapacity() == ((Storage) obj).getTotalCapacity();
    }
}
