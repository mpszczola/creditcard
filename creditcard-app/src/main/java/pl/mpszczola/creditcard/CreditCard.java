package pl.mpszczola.creditcard;
// moj komentarz
class CreditCard {
    public void assignLimit(double money){
        
    }
    // get limit will retur current limit
    public double getLimit(){
        return 2000;
    }

    public void repayDebt(){
        if(account.getMoney() >= debt){
            double result = account.getMoney() - debt;
            account.setMoney((result));
        }
        else{
            throw new RuntimeException("Not enough money");
        }
    }
}