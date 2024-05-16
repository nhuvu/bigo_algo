package DataAbstraction.SumOfFractions;

public class Fraction {
    int num;
    int denom;

    public Fraction(){
        this.num = 0;
        this.denom = 1;
    }

    public Fraction(int a, int b){
        this.num = a;
        this.denom = b;
    }

    public Fraction sumFraction (Fraction f){
        Fraction result = new Fraction();
        result.num = this.num * f.denom + this.denom * f.num;
        result.denom = this.denom * f.denom;
        result.reduceFraction();
        return result;
    }

    public void reduceFraction(){
        if(this.num == 0){
            this.denom = 1;
            return;
        }
        int x = gcd(Math.abs(this.num), Math.abs(this.denom));
        this.num = this.num / x;
        this.denom = this.denom / x;
    }

    public int gcd (int a, int b){
        if(b == 0){
            return a;
        }
        int remainder = a % b;
        return gcd(b, remainder);
    }

    @Override
    public String toString() {
        return String.format("%d %d", this.num, this.denom);
    }
}
