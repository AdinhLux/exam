package lu.uni.intro2prog.exam.task1;

/**
 * Class representing a Container in a Storage.
 */
public class Container {

    /**
     * Container's Height
     */
    private int mHeight;
    /**
     * Container's Width
     */
    private int mWidth;
    /**
     * Container's Length
     */
    private int mLength;

    /**
     * Constructor
     *
     * @param height Container's Height
     * @param width  Container's Width
     * @param length Container's Length
     */
    public Container(int height, int width, int length) {
        mHeight = height;
        mWidth = width;
        mLength = length;
    }

    /**
     * Returns Container's Height
     *
     * @return the Container's Height
     */
    public int getHeight() {
        return mHeight;
    }

    /**
     * Set Container's Height
     *
     * @param mHeight the attributed value for Container's Height
     */
    public void setHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    /**
     * Returns Container's Width
     *
     * @return the Container's Width
     */
    public int getWidth() {
        return mWidth;
    }

    /**
     * Set Container's Width
     *
     * @param mWidth the attributed value for Container's Width
     */
    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Returns Container's Length
     *
     * @return the Container's Length
     */
    public int getLength() {
        return mLength;
    }

    /**
     * Set Container's Length
     *
     * @param mLength the attributed value for Container's Length
     */
    public void setLength(int mLength) {
        this.mLength = mLength;
    }
}
