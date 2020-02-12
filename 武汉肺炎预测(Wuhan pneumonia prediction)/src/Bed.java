/**
 * bed number
 *
 *
 * @ClassName: Bed
 * @Description: bed number
 * @author: Mingwei
 * @date: 2020年02月02日 21:00
 */
public class Bed extends Point {
    public Bed(int x, int y) {
        super(x, y);
    }

    /**
     * get the bed or not
     */
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

}
