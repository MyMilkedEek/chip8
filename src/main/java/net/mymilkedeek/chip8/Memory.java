package net.mymilkedeek.chip8;

public class Memory {

    public static final int START_RAM   = 0x000; // 0
    public static final int START_PROG  = 0x200; // 512
    public static final int START_ETI   = 0x600; // 1536
    public static final int END_RAM     = 0xFFF; // 4095
    public static final int MEMORY_SIZE = 0x1000; // 4096

    private byte[] memory;

    public Memory() {
        this.memory = new byte[MEMORY_SIZE];
    }

    /**
     * Reads a byte from memory
     *
     * @param location location in the memory that you'd like to read.
     *
     * @return the data at the specified location
     */
    public byte read(int location) {
        if ( location > END_RAM || location < START_RAM ) {
            throw new IllegalArgumentException("Location must be within the bounds of the memory.");
        }

        return this.memory[location];
    }

    /**
     * Writes data to the memory at the specified location.
     *
     * @param location location to write to
     * @param data data to write
     */
    public void write(int location, byte data) {
        if ( location > END_RAM || location < START_RAM ) {
            throw new IllegalArgumentException("Location must be within the bounds of the memory.");
        }

        this.memory[location] = data;
    }

}