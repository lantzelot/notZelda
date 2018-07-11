public abstract class AbstractContent implements Content
{
    protected int posX;
    protected int posY;

    protected int length;
    protected int width;

    protected Blocktype blocktype;

    protected AbstractContent(int length, int width, int posX, int posY, Blocktype blocktype) {
        this.length = length;
        this.width = width;
        this.posX = posX;
        this.posY = posY;
        this.blocktype = blocktype;
    }

    @Override public void setposX(int pos) {
	posX = pos;
    }

    @Override public void setposY(int pos) {
    	posY = pos;
    }

    @Override public void draw() {

    }



    @Override public void tick() {

    }

    @Override public int getposX() {
	return posX;
    }

    @Override public int getposY() {
	return posY;
    }

    @Override public Blocktype getBlocktype() {
	return blocktype;
    }
}
