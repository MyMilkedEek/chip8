package net.mymilkedeek.chip8;

public class Memory {

    public static final int START_RAM   = 0x000; // 0
    public static final int START_PROG  = 0x200; // 512
    public static final int START_ETI   = 0x600; // 1536
    public static final int END_RAM     = 0xFFF; // 4095

    private byte[] memory;

    public Memory() {
        this.memory = new byte[END_RAM + 1];
    }

}