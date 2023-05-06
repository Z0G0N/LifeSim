public class ColorText {

    public String Black() {
        return "\033[0;30m";
    }

    public String Red() {
        return "\033[0;31m";
    }

    public String Green() {
        return "\033[0;32m";
    }

    public String Yellow() {
        return "\033[0;33m";
    }

    public String Blue() {
        return "\033[0;34m";
    }

    public String Purple() {
        return "\033[0;35m";
    }

    public String Cyan() {
        return "\033[0;36m";
    }

    public String White() {
        return "\033[0;37m";
    }

    public String Reset() {
        return "\033[0m";
    }

    public String Clear() {
        return "\033[H\033[2J";
    }

    public String ClearLine() {
        return "\033[2K";
    }
}
