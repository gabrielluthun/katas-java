class School {
    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (int) Math.floor((double) sum / marks.length);
    }
}