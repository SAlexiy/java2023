package mathematics.math.sign;

public class Sign {

    /**
     * Если num > 0, возврашает 1,
     * Если num == 0,возвращает 0,
     * Если num < 0, возвращает -1.
     *
     * @param num
     * @return Integer
     */
    public Integer getSign(int num) {

        if (num > 0) {
            return 1;
        } else if (num == 0) {
            return 0;
        } else{
            return -1;
        }

    }
}
