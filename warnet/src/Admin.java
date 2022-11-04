import java.util.Scanner;
public class Admin {
    private String uesrname;
    private String password;
    User u = new User();
    Transaksi t = new Transaksi();
    Member m = new Member();
    Scanner in=new Scanner(System.in);
    protected void melihat(int a, int b){
        System.out.println("Id user : "+a);
        System.out.println("biaya : "+b);
    }
    private String user(){
        String u = "admin";
        return u;
    }
    private String pass(){
        String p = "admin";
        return p;
    }
    protected boolean mengisi(){
        boolean a = false;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan username : ");
        uesrname = in.next();
        setUesrname(uesrname);



        if(uesrname.equals(user())){
            System.out.print("Masukkan Password : ");
            password=in.next();
            setPassword(password);
            if(password.equals(pass())){
                a = true;
            }
            else{
                System.out.println("Password Salah");
            }
        }
        else {
            System.out.println("Bukan Admin");
        }
        return a;
    }
    protected int mengatur(){
        int harga;
        int diskon;
        System.out.println("Masukkan Tarif harga perjam :");
        harga = in.nextInt();
        t.setTarif(harga);
        return t.setTarif(harga);
    }
    protected int mengatur(int a){
        int diskon;
        System.out.println("Masukkan Diskon untuk member(%) : ");
        diskon = in.nextInt();
        t.setDiskon(a*diskon/100);
        return t.setDiskon(a*diskon/100);
    }


    public String getUesrname() {
        return uesrname;
    }

    public void setUesrname(String uesrname) {
        this.uesrname = uesrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
