import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CuboidMain {
    public static void main(String[] args) {
        String namaFile = "C:\\Users\\M-SI\\Downloads\\cuboid.csv";

        List<Cuboid> cuboid = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                Cuboid c = new Cuboid();
                c.panjang = Double.parseDouble(row[0]);
                c.lebar = Double.parseDouble(row[1]);
                c.tinggi = Double.parseDouble(row[2]);
                cuboid.add(c);

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        for (Cuboid balok : cuboid) {
            double volume = balok.hitungVolume();
            double luasPermukaan = balok.hitungLuasPermukaan();
            System.out.println("Volume balok adalah: " + volume);
            System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
        }
    }
}
