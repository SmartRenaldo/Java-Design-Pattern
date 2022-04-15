package com.x.principles.demo03.after;

import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void testRunInComputer() {
        CPU cpu = new IntelCPU();
        Memory memory = new KingstonMemory();
        HardDisk hardDisk = new XiJieHardDisk();
        Computer computer = new Computer();

        computer.setMemory(memory);
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
