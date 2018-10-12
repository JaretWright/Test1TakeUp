public class Sign {
    private String message;
    private int height, width;

    public Sign(String message, int height, int width) {
        setMessage(message);
        setHeight(height);
        setWidth(width);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (!message.isEmpty())
            this.message = message;
        else
            throw new IllegalArgumentException("message cannot be empty");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 10 && height <=100)
            this.height = height;
        else
            throw new IllegalArgumentException("height must be 10-100");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>=10 && width <= 500)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be 10-500");
    }

    @Override
    public String toString()
    {
        return String.format("%d wide x %d high%nmessage: %s", width, height, message);
    }
}
