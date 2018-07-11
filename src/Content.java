public interface Content
{
    void draw();
    void setposX(int pos);
    void setposY(int pos);

    void tick();

    int getposX();
    int getposY();
    Blocktype getBlocktype();
}
