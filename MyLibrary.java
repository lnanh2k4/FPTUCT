

import java.util.Scanner;

/**
 * 
 *
 * @author Le Nhut Anh
 */
public class MyLib {

    /**
     * Object is used to get information from keyboard.
     */
    public static Scanner sc = new Scanner(System.in);

    // ##### INPUT AND OUTPUT HANDLE FOR INTEGER SECTION #####
    /**
     * Method is used to required user that input an integer number
     *
     * @param iMg input message
     * @return an integer number
     */
    public static int getInteger(String iMg) {
        //Declare variable
        int x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Integer.parseInt(sc.nextLine());
                //return result when user input valid value follow requirement
                return x;
            } catch (NumberFormatException e) {
                //print content guide user input valid value
                System.out.println("Please enter an integer number again!");
            }
        }
    }

    /**
     * Method is used to required user that input an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg) {
        //Declare variable
        int x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Integer.parseInt(sc.nextLine());
                //return result when user input valid value follow requirement
                return x;
            } catch (NumberFormatException e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @param sign sign of limit
     * @param limit number limit
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg, String sign, int limit) {
        //Declare variable
        int x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Integer.parseInt(sc.nextLine());
                /*check character with matching sign. 
                If condition is valid, it do nothing. 
                Otherwise, it will throw exception*/
                switch (sign) {
                    case ">":
                        if (x <= limit) {
                            throw new Exception();
                        }
                        break;
                    case "<":
                        if (x >= limit) {
                            throw new Exception();
                        }
                        break;
                    case "<=":
                        if (x > limit) {
                            throw new Exception();
                        }
                        break;
                    case ">=":
                        if (x < limit) {
                            throw new Exception();
                        }
                        break;
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg, int from, int to) {
        //Declare variable
        int x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                /*check minimum value and maximum value. 
                If minimum value is greater than maximum value, 
                it will swap value of variable*/
                if (from > to) {
                    int temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Integer.parseInt(sc.nextLine());
                //check range of x. If x is outbound of range, it will throw exception
                if (x > to || x < from) {
                    throw new Exception();
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    // ##### INPUT AND OUTPUT HANDLE FOR FLOAT SECTION #####
    /**
     * Method is used to required user that input a real number (float type)
     *
     * @param iMg input message
     * @return a real number
     */
    public static float getFloat(String iMg) {
        //Declare variable
        float x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Float.parseFloat(sc.nextLine());
                //return result when user input valid value follow requirement
                return x;
            } catch (NumberFormatException e) {
                //print content guide user input valid value
                System.out.println("Please enter a real number again!");
            }
        }
    }

    /**
     * Method is used to required user that input a real number (float type)
     *
     * @param iMg input message
     * @param eMg error message
     * @return a real number
     */
    public static float getFloat(String iMg, String eMg) {
        //Declare variable
        float x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Float.parseFloat(sc.nextLine());
                //return result when user input valid value follow requirement
                return x;
            } catch (NumberFormatException e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a real number (float type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param sign sign of limit
     * @param limit number limit
     * @return a real number
     */
    public static float getFloat(String iMg, String eMg, String sign, float limit) {
        //Declare variable
        float x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Float.parseFloat(sc.nextLine());
                /*check character with matching sign. 
                If condition is valid, it do nothing. 
                Otherwise, it will throw exception*/
                switch (sign) {
                    case ">":
                        if (x <= limit) {
                            throw new Exception();
                        }
                        break;
                    case "<":
                        if (x >= limit) {
                            throw new Exception();
                        }
                        break;
                    case "<=":
                        if (x > limit) {
                            throw new Exception();
                        }
                        break;
                    case ">=":
                        if (x < limit) {
                            throw new Exception();
                        }
                        break;
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a real number (float type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return a real number
     */
    public static float getFloat(String iMg, String eMg, float from, float to) {
        //Declare variable
        float x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                /*check minimum value and maximum value. 
                If minimum value is greater than maximum value, 
                it will swap value of variable*/
                if (from > to) {
                    float temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Float.parseFloat(sc.nextLine());
                //It will throw exception if result after checking is invalid value
                if (x > to) {
                    throw new Exception();
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    // ##### INPUT AND OUTPUT HANDLE FOR DOUBLE SECTION #####
    /**
     * Method is used to required user that input a real number (Double type)
     *
     * @param iMg input message
     * @return a real number
     */
    public static double getDouble(String iMg) {
        //Declare variable
        double x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Double.parseDouble(sc.nextLine());
                //return result when user input valid value follow requirement
                return x;
            } catch (NumberFormatException e) {
                //print content guide user input valid value
                System.out.println("Please enter a real number again!");
            }
        }
    }

    /**
     * Method is used to required user that input a real number (Double type)
     *
     * @param iMg input message
     * @param eMg error message
     * @return a real number
     */
    public static double getDouble(String iMg, String eMg) {
        //Declare variable
        double x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Double.parseDouble(sc.nextLine());
                //return result when user input valid value follow requirement
                return x;
            } catch (NumberFormatException e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a real number (Double type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param sign sign of limit
     * @param limit number limit
     * @return a real number
     */
    public static double getDouble(String iMg, String eMg, String sign, double limit) {
        //Declare variable
        double x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Double.parseDouble(sc.nextLine());
                /*check character with matching sign. 
                If condition is valid, it do nothing. 
                Otherwise, it will throw exception*/
                switch (sign) {
                    case ">":
                        if (x <= limit) {
                            throw new Exception();
                        }
                        break;
                    case "<":
                        if (x >= limit) {
                            throw new Exception();
                        }
                        break;
                    case "<=":
                        if (x > limit) {
                            throw new Exception();
                        }
                        break;
                    case ">=":
                        if (x < limit) {
                            throw new Exception();
                        }
                        break;
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a real number (Double type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return a real number
     */
    public static double getDouble(String iMg, String eMg, double from, double to) {
        //Declare variable
        double x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                /*check minimum value and maximum value. 
                If minimum value is greater than maximum value, 
                it will swap value of variable*/
                if (from > to) {
                    double temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = Double.parseDouble(sc.nextLine());
                //check range of x. If x is outbound of range, it will throw exception
                if (x > to || x < from) {
                    throw new Exception();
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    // ##### INPUT AND OUTPUT HANDLE FOR STRING SECTION #####
    /**
     * Method is used to required user that input a string
     *
     * @param iMg input message
     * @return string
     */
    public static String getString(String iMg) {
        //Declare variable
        String x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = sc.nextLine();
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println("Please enter a string again!");
            }
        }
    }

    /**
     * Method is used to required user that input a string
     *
     * @param iMg input message
     * @param eMg error message
     * @return a string
     */
    public static String getString(String iMg, String eMg) {
        //Declare variable
        String x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = sc.nextLine();
                //it removes whitespace from both ends of a string.
                x = x.trim();
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a string
     *
     * @param iMg input message
     * @param eMg error message
     * @param length specific length
     * @return a string
     */
    public static String getString(String iMg, String eMg, int length) {
        //Declare variable
        String x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = sc.nextLine();
                //it removes whitespace from both ends of a string.
                x = x.trim();
                /* It will throw exception 
                when string is not equal to length of string 
                or it is an empty string
                 */
                if (x.length() != length || x.isEmpty()) {
                    throw new Exception();
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a string
     *
     * @param iMg input message
     * @param eMg error message
     * @param minLength minimum length
     * @param maxLength maximum length
     * @return a string
     */
    public static String getString(String iMg, String eMg, int minLength, int maxLength) {
        //Declare variable
        String x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                /*check minimum value and maximum value. 
                If minimum value is greater than maximum value, 
                it will swap value of variable*/
                if (minLength > maxLength) {
                    int temp;
                    temp = minLength;
                    minLength = maxLength;
                    maxLength = temp;
                }
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = sc.nextLine();
                //it removes whitespace from both ends of a string.
                x = x.trim();
                //check range of x. If x is outbound of range or it is an empty string, it will throw exception
                if (x.length() < minLength || x.length() > maxLength || x.isEmpty()) {
                    throw new Exception();
                }
                //print content guide user input valid value
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to required user that input a string. If the condition is
     * yes, the method will check whether the string is empty or not? If the
     * string entered by the user is empty, an error is reported
     *
     * @param iMg input message
     * @param eMg error message
     * @param con condition (T: true/F: false).
     * @return a string
     */
    public static String getString(String iMg, String eMg, String con) {
        //Declare variable
        String x;
        //check value. It will be iterable if catch invalid value
        while (true) {
            try {
                //print content that require user input valid value
                System.out.print(iMg);
                //variable is used to store data that input from user
                x = sc.nextLine();
                //it removes whitespace from both ends of a string.
                x = x.trim();
                //It will throw exception when it is an empty string.
                if (con.equalsIgnoreCase("T") || con.equalsIgnoreCase("true")) {
                    if (x.isEmpty()) {
                        throw new Exception();
                    }
                }
                //return result when user input valid value follow requirement
                return x;
            } catch (Exception e) {
                //print content guide user input valid value
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to print frame of table. It will print repeat content with
     * times is equal to number variable
     *
     * @param num number to print message
     * @param pMg print message
     */
    public static void printCharacterLoop(int num, String pMg) {
        //Print repeat content with times is equal to num variable 
        for (int i = 0; i < num; i++) {
            System.out.print(pMg);
        }
    }
}
