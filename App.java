public class App {
 
    public static void main(String[] args) {
        // Criando os empregados
        Mensalista men1 = new Mensalista("Yuri", "Rua abc", "Junior");
        Mensalista men2 = new Mensalista("Dantas", "Rua sem fim", "Senior");
 
        Horista hora1 = new Horista("Guilherme", "Rua xyz", 20);  // 20 horas trabalhadas
        Horista hora2 = new Horista("Cristina", "Rua do centro", 100);  // 100 horas trabalhadas
 
        // Calculando salário para Mensalistas
        men1.calcularSalario();
        men2.calcularSalario();
 
        // Imprimindo os dados de Mensalistas
        System.out.println("--- Mensalista 1 ---");
        men1.imprimirDados();
        System.out.println("INSS: " + men1.calcularINSS());
        System.out.println("IRPF: " + men1.calcularIRPF());
        System.out.println("Salário após INSS e IRPF: " + (men1.getSalario() - men1.calcularINSS() - men1.calcularIRPF()));
 
        System.out.println("\n--- Mensalista 2 ---");
        men2.imprimirDados();
        System.out.println("INSS: " + men2.calcularINSS());
        System.out.println("IRPF: " + men2.calcularIRPF());
        System.out.println("Salário após INSS e IRPF: " + (men2.getSalario() - men2.calcularINSS() - men2.calcularIRPF()));
 
        // Calculando salário para Horistas
        hora1.calcularSalario();
        hora2.calcularSalario();
 
        // Imprimindo os dados de Horistas
        System.out.println("\n--- Horista 1 ---");
        hora1.imprimirDados();
        System.out.println("Salário: " + hora1.getSalario());
 
        System.out.println("\n--- Horista 2 ---");
        hora2.imprimirDados();
        System.out.println("Salário: " + hora2.getSalario());
    }
}