package xyz.connorchickenway.towers.cmd;

public enum CommandReason {

    OK(true),
    MISSING_ARGUMENTS(false),
    RETURN(true),
    USAGE(false),
    WRONG_ARGS(false),
    ERROR(false),
    SOMETHING_ELSE(false);

    private final boolean ret;

    CommandReason(boolean ret) {
        this.ret = ret;
    }

    public boolean getReturn() {
        return ret;
    }

}
