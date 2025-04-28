public class mainMascotas {

        public static void main(String[] args) {
            RegistroMascotas mascotas = new RegistroMascotas("Toro", "Pitbull", 1);

            mascotas.mostrarInfo();
            System.out.println("-------------------------");
            mascotas.cumplirAnios();
        }
    }
