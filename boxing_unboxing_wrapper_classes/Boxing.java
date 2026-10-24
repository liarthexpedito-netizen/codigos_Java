package boxing_unboxing_wrapper_classes;

public class Boxing {
    public static void main(String[] args) {
        
    //Boxing: É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.
    int x = 20;
    Object y = x;
    System.out.println(y);
    //Unboxing: É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível.
    int a = 20;
    Object b = a;
    int c = (int) b;
    System.out.println(c);
    //Wrapper classes: São classes equivalentes aos tipos primitivos.

    /*
 * =====================================================
 * HIERARQUIA DE CLASSES WRAPPER E TIPOS PRIMITIVOS EM JAVA
 * =====================================================
 * 
 *                    Object
 *                       │
 *       ┌───────────────┼───────────────┐
 *       ▼               ▼               ▼
 *     Number         Boolean        Character
 *   (Abstrata)      (boolean)         (char)
 *       │
 *       ├── Byte    -> primitivo: byte
 *       ├── Short   -> primitivo: short
 *       ├── Integer -> primitivo: int
 *       ├── Long    -> primitivo: long
 *       ├── Float   -> primitivo: float
 *       └── Double  -> primitivo: double
 * 
 * =====================================================
 */

    }
  
}
