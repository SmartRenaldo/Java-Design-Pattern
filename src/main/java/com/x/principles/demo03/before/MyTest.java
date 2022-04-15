package com.x.principles.demo03.before;

import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    public void testRunInComputer() {
        KingstonMemory memory = new KingstonMemory();
        IntelCPU cpu = new IntelCPU();
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        Computer computer = new Computer();

        computer.setMemory(memory);
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
