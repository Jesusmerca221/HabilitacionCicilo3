

public class pruebaFuncionamiento {
    public static void main(String[] args) {
        //Prueba de funcionamiento para la clase Empresa
        //Aqui cree una instancia de la clase 
        Empresa empresa1 = new Empresa("ARA", "Medellin", 123, 444);
        System.out.println("Datos de la empresa antes de modificar\n" + "Nombre: " + empresa1.getNombreEmpresa() + "\nDirección: " + empresa1.getDireccion() + "\nTelefono: " + empresa1.getTelefono() + "\nNIT: " + empresa1.getNIT());
        //Aca leo el nombre de la empresa
        empresa1.getNombreEmpresa();
        //Aca modifico el nombre de la empresa
        empresa1.setNombreEmpresa("BBVA");
        //Aca leo la direccion de la empresa
        empresa1.getDireccion();
        //Aca modifico la direccion de la empresa
        empresa1.setDireccion("Cartagena");
        //Aca leo el telefono de la empresa
        empresa1.getTelefono();
        //Aca modifico el telefono de la empresa
        empresa1.setTelefono(323);
        //Aca leo el NIT de la Empresa
        empresa1.getNIT();
        //Aca modifico el NIT de la empresa
        empresa1.setNIT(111);
        System.out.println();
        System.out.println("Datos de la empresa despues de modificar\n" + "Nombre: " + empresa1.getNombreEmpresa() + "\nDirección: " + empresa1.getDireccion() + "\nTelefono: " + empresa1.getTelefono() + "\nNIT: " + empresa1.getNIT());
    }
}
