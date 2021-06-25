/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
IOException
RemoteException
NoSuchFieldException
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
*/
package Exercise_89;

import java.io.IOException;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws IOException {
        processExceptions(new Main());
    }

    public static void processExceptions(Main obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException e) {
            System.out.println("RemoteException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
