package net.mymilkedeek.chip8;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test
    public void writeAndReadDataTest() {
        byte expected = (byte) 42;

        Memory memory = new Memory();
        memory.write(Memory.START_PROG, expected);

        Assert.assertEquals(expected, memory.read(Memory.START_PROG));
    }

    @Test(expected = IllegalArgumentException.class)
    public void writeToNegativeLocationTest() {
        Memory memory = new Memory();
        memory.write(Memory.START_RAM - 1, (byte) 42);
    }

    @Test(expected = IllegalArgumentException.class)
    public void writeToLocationOutOfBoundsTest() {
        Memory memory = new Memory();
        memory.write(Memory.END_RAM + 1, (byte) 42);
    }

    @Test(expected = IllegalArgumentException.class)
    public void readFromNegativeLocationTest() {
        Memory memory = new Memory();
        memory.read(Memory.START_RAM - 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void readFromLocationOutOfBoundsTest() {
        Memory memory = new Memory();
        memory.read(Memory.END_RAM + 1);
    }
}