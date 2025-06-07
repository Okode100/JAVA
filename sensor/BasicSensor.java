class BasicSensor{
    private double value;

    public BasicSensor(double value){
        this.value = value;
    }
    public void setValue(double value){
        this.value =value;
    }
    public double getValue(){
        return value;
    }
    public void clearValue(){
        this.value = 0;
    }

}

class MemorySensor extends BasicSensor {
    private int memoryPositions;
    private double memory[];

    public MemorySensor(double value, int memoryPositions) {
        super(value);
        this.memoryPositions= memoryPositions;
        memory = new double[memoryPositions];
        memory[0] = value;

    }

    public double[] getOldValues(){
        return memory;

    }

    public void setValue(double value){
        for (int i = memoryPositions -1; i >= 1; i--){
            memory[i] = memory[i-1];
        }
        memory[0] = value;
    }
    void printAllValues(){
        System.out.print("( ");
        for (int i=0; i < memoryPositions - 1; i++) {
            System.out.print(memory[i]+", ");

        }
        System.out.println(memory[memoryPositions-1]+")");
    }

    }
    class TestSensor{
        public static void main(String[] args){
            MemorySensor a = new MemorySensor(15.0,5);
            MemorySensor b = new MemorySensor(10.0,5);
            a.setValue(234.0);
            b.setValue(235.0);
            System.out.println("Actual value of sensor a: "+a.getValue());
            System.out.println("Actual value of sensor b: "+b.getValue());
            System.out.print("Memory of sensor a: ");
            a.printAllValues();
            System.out.print("Memory of sensor b: ");
            b.printAllValues();
       }
    }

 