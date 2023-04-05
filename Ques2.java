
// The car service station caters to different types of cars – Hatchback, Sedan, SUV.
// It provides different types of services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing and Brake Fixing.
// Each service has a service code associated with it and different prices for different types of cars.
// 
// Service Code Service Hatchback Sedan SUV
// BS01 Basic Servicing ₹ 2000 ₹ 4000 ₹ 5000
// EF01 Engine Fixing ₹ 5000 ₹ 8000 ₹ 10000
// CF01 Clutch Fixing ₹ 2000 ₹ 4000 ₹ 6000
// BF01 Brake Fixing ₹ 1000 ₹ 1500 ₹ 2500
// GF01 Gear Fixing ₹ 3000 ₹ 6000 ₹ 8000

// The software should generate a detailed bill with the total amount for each service request based on the Type of
// Car specified and the requested Service Codes.
// Example:
// Type of Car – Hatchback
// Service Codes – BS01, EF01
// Charges for Basic Servicing – ₹ 2000
// Charges for Engine Fixing – ₹ 5000
// Total Bill – ₹ 7000
// In addition, if the total service bill is more than ₹ 10000, a complimentary cleaning should be provided and specified
// in the bill.

package com.stuffvish;

import java.util.*;

public class Ques2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Type Hatchback for Hatchback" + "\n" 
                            + "Type Sedan for Sedan" + "\n" 
                            + "Type SUV for SUV");

        System.out.println("Type of Car - ");
        String choice = sc.nextLine();

        ArrayList<String> servicesSelected = new ArrayList<>();
        HashMap<String, String> serviceCode = new HashMap<>();
        serviceCode.put("BS01", "Basic Servicing");
        serviceCode.put("EF01", "Engine Fixing");
        serviceCode.put("CF01", "Clutch Fixing");
        serviceCode.put("BF01", "Brake Fixing");
        serviceCode.put("GF01", "Gear Fixing");

        HashMap<String, Integer> hatchPrices = new HashMap<>();
        HashMap<String, Integer> sedanPrices = new HashMap<>();
        HashMap<String, Integer> suvPrices = new HashMap<>();

        // Price List for Hatchback Cars 
        hatchPrices.put("BS01", 2000);
        hatchPrices.put("EF01", 5000);
        hatchPrices.put("CF01", 2000);
        hatchPrices.put("BF01", 1000);
        hatchPrices.put("GF01", 3000);

        // Price List for Sedan Cars 
        sedanPrices.put("BS01", 4000);
        sedanPrices.put("EF01", 8000);
        sedanPrices.put("CF01", 4000);
        sedanPrices.put("BF01", 1500);
        sedanPrices.put("GF01", 6000);
        
        // Price List for SUV Cars 
        suvPrices.put("BS01", 5000);
        suvPrices.put("EF01", 10000);
        suvPrices.put("CF01", 6000);
        suvPrices.put("BF01", 2500);
        suvPrices.put("GF01", 8000);

        int sum = 0;
        switch(choice){

            case "Hatchback" : {
                System.out.println("Type BS01 for Basic Servicing at ₹ 2000" + "\n" 
                                    + "Type EF01 for Engine Fixing at ₹ 5000" + "\n"
                                    + "Type CF01 for Clutch Fixing at ₹ 2000" + "\n"
                                    + "Type BF01 for Brake Fixing at ₹ 1000" + "\n"
                                    + "Type GF01 for Gear Fixing at ₹ 3000" + "\n"
                                    + "Type Bill to generate bill");
                
                while(true){
                    String case1 = sc.nextLine();
                    if(case1.equals("Bill")){
                        break;
                    }
                    else{
                        servicesSelected.add(case1);
                    }
                }
                break;
            }

            case "Sedan" : {
                System.out.println("Type BS01 for Basic Servicing at ₹ 4000" + "\n" 
                                    + "Type EF01 for Engine Fixing at ₹ 8000" + "\n"
                                    + "Type CF01 for Clutch Fixing at ₹ 4000" + "\n"
                                    + "Type BF01 for Brake Fixing at ₹ 1500" + "\n"
                                    + "Type GF01 for Gear Fixing at ₹ 6000" + "\n"
                                    + "Type Bill to generate bill");
                
                while(true){
                    String case1 = sc.nextLine();
                    if(case1.equals("Bill")){
                        break;
                    }
                    else{
                        servicesSelected.add(case1);
                    }
                }
                break;
            }

            case "SUV" : {
                System.out.println("Type BS01 for Basic Servicing at ₹ 5000" + "\n" 
                                    + "Type EF01 for Engine Fixing at ₹ 10000" + "\n"
                                    + "Type CF01 for Clutch Fixing at ₹ 6000" + "\n"
                                    + "Type BF01 for Brake Fixing at ₹ 2500" + "\n"
                                    + "Type GF01 for Gear Fixing at ₹ 8000" + "\n"
                                    + "Type Bill to generate bill");
                
                while(true){
                    String case1 = sc.nextLine();
                    if(case1.equals("Bill")){
                        break;
                    }
                    else{
                        servicesSelected.add(case1);
                    }
                }
                break;
            }

            default :
                System.out.println("Please Enter Valid Car Type");
        }

        System.out.print("Service Codes - ");
        for(int i = 0; i < servicesSelected.size(); i++){
            System.out.print(servicesSelected.get(i) + ", ");
        }
        System.out.println();

        for(int i = 0; i < servicesSelected.size(); i++){
            if(choice.equals("Hatchback")){
                System.out.println("Charge for " + serviceCode.get(servicesSelected.get(i)) + " - ₹ " + hatchPrices.get(servicesSelected.get(i)));
                sum += hatchPrices.get(servicesSelected.get(i));
            }
            else if(choice.equals("Sedan")){
                System.out.println("Charge for " + serviceCode.get(servicesSelected.get(i)) + " - ₹ " + sedanPrices.get(servicesSelected.get(i)));
                sum += sedanPrices.get(servicesSelected.get(i));
            }
            else{
                System.out.println("Charge for " + serviceCode.get(servicesSelected.get(i)) + " - ₹ " + suvPrices.get(servicesSelected.get(i)));
                sum += suvPrices.get(servicesSelected.get(i));
            }
        }

        if(sum < 10000){
            System.out.println("Total Bill - ₹ " + sum);
        }
        else{
            System.out.println("Total Bill - ₹ " + sum + " + Complimentary Cleaning");
        }
    }
}
