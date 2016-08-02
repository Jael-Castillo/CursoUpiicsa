package itokcenter.com.listas;

/**
 * Created by Gorro on 02/08/16.
 */
public class ItemRc {

    String name;
    int img;

    public ItemRc(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
