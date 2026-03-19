class ReportSRP {
    public void generateReport() {
        System.out.println("Generating Report...");
    }
}

class ReportSaver {
    public void saveToFile() {
        System.out.println("Saving Report to File...");
    }
}

public class MainSRP {
    public static void main(String[] args) {
        ReportSRP report = new ReportSRP();
        report.generateReport();

        ReportSaver saver = new ReportSaver();
        saver.saveToFile();
    }
}