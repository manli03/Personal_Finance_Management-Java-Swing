/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;

/**
 *
 * @author User
 */
public class Budget {
    private String category;
    private double targetAmount;

    public Budget(String category, double targetAmount) {
        this.category = category;
        this.targetAmount = targetAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public void updateBudget(double newAmount) {
        this.targetAmount = newAmount;
    }
}