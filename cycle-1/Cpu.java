import java.util.Scanner;

public class Cpu {
    public static void main(String[] arg) {
        System.out.println("Name : Shaibin KB\nRoll.no : 50\nTitle : Display CPU specs\nDate : 14/02/2024\n");

        class CpuClass {
            int price;

            public CpuClass(int price) {
                this.price = price;
            }

            class Processor {
                int noOfCores;
                String manufacturer;

                public Processor(int noOfCores, String manufacturer) {
                    this.noOfCores = noOfCores;
                    this.manufacturer = manufacturer;
                }

                class Ram {
                    int memory;
                    String manufacturer;

                    public Ram(int memory, String manufacturer) {
                        this.memory = memory;
                        this.manufacturer = manufacturer;
                    }
                }
            }
        }

        CpuClass cpu = new CpuClass(1000);
        CpuClass.Processor processor = cpu.new Processor(8, "Intel");
        CpuClass.Processor.Ram ram = processor.new Ram(16, "Samsung");

        System.out.println("Cpu price is : " + cpu.price + "\n");
        System.out.println("processor no.of core is : " + processor.noOfCores);
        System.out.println("processor manufacturer is : " + processor.manufacturer + "\n");
        System.out.println("Ram size is : " + ram.memory);
        System.out.println("Ram manufacturer is : " + ram.manufacturer);
    }
}

