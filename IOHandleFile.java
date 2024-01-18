
import java.util.Scanner;

/**
 *
 * @author Le Nhut Anh
 */
public class IOHandleFile {

    /**
     *
     */
    public static Scanner sc = new Scanner(System.in);

    /**
     * Function is used to enter an integer number
     *
     * @param iMg input message
     * @return an integer number
     */
    public static int getInteger(String iMg) {
        int x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Integer.parseInt(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("Error type! Please enter number again!");
            }
        }
    }

    /**
     * Function is used to enter an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg) {
        int x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Integer.parseInt(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @param sign sign of limit
     * @param limit number limit
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg, String sign, int limit) {
        int x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Integer.parseInt(sc.nextLine());
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
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg, int from, int to) {
        int x;
        while (true) {
            try {
                if (from > to) {
                    int temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                System.out.print(iMg);
                x = Integer.parseInt(sc.nextLine());
                if (x > to || x < from) {
                    throw new Exception();
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a real number (Float type)
     *
     * @param iMg input message
     * @return a real number
     */
    public static float getFloat(String iMg) {
        float x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Float.parseFloat(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("Error type! Please enter number again!");
            }
        }
    }

    /**
     * Function is used to enter a real number (Float type)
     *
     * @param iMg input message
     * @param eMg error message
     * @return a real number
     */
    public static float getFloat(String iMg, String eMg) {
        float x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Float.parseFloat(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a real number (Float type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param sign sign of limit
     * @param limit number limit
     * @return a real number
     */
    public static float getFloat(String iMg, String eMg, String sign, float limit) {
        float x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Float.parseFloat(sc.nextLine());
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
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a real number (Float type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return a real number
     */
    public static float getFloat(String iMg, String eMg, float from, float to) {
        float x;
        while (true) {
            try {
                if (from > to) {
                    float temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                System.out.print(iMg);
                x = Float.parseFloat(sc.nextLine());
                if (x > to) {
                    throw new Exception();
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a real number (Double type)
     * @param iMg input message
     * @return a real number
     */
    public static double getDouble(String iMg) {
        double x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Double.parseDouble(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println("Error type! Please enter number again!");
            }
        }
    }

    /**
     * Function is used to enter a real number (Double type)
     *
     * @param iMg input message
     * @param eMg error message
     * @return a real number
     */
    public static double getDouble(String iMg, String eMg) {
        double x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Double.parseDouble(sc.nextLine());
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a real number (Double type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param sign sign of limit
     * @param limit number limit
     * @return a real number
     */
    public static double getDouble(String iMg, String eMg, String sign, double limit) {
        double x;
        while (true) {
            try {
                System.out.print(iMg);
                x = Double.parseDouble(sc.nextLine());
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
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a real number (Double type)
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return a real number
     */
    public static double getDouble(String iMg, String eMg, double from, double to) {
        double x;
        while (true) {
            try {
                if (from > to) {
                    double temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                System.out.print(iMg);
                x = Double.parseDouble(sc.nextLine());
                if (x > to || x < from) {
                    throw new Exception();
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a string
     *
     * @param iMg input message
     * @return string
     */
    public static String getString(String iMg) {
        String x;
        while (true) {
            try {
                System.out.print(iMg);
                x = sc.nextLine();
                return x;
            } catch (Exception e) {
                System.out.println("Error type! Please enter again!");
            }
        }
    }

    /**
     * Function is used to enter a string
     *
     * @param iMg input message
     * @param eMg error message
     * @return a string
     */
    public static String getString(String iMg, String eMg) {
        String x;
        while (true) {
            try {
                System.out.print(iMg);
                x = sc.nextLine();
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a string
     *
     * @param iMg input message
     * @param eMg error message
     * @param length specific length
     * @return a string
     */
    public static String getString(String iMg, String eMg, int length) {
        String x;
        while (true) {
            try {
                System.out.print(iMg);
                x = sc.nextLine();
                x.trim();

                if (x.length() != length || x.isEmpty()) {
                    throw new Exception();
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a string
     *
     * @param iMg input message
     * @param eMg error message
     * @param minLength minimum length
     * @param maxLength maximum length
     * @return a string
     */
    public static String getString(String iMg, String eMg, int minLength, int maxLength) {
        String x;
        while (true) {
            try {
                if (minLength > maxLength) {
                    int temp;
                    temp = minLength;
                    minLength = maxLength;
                    maxLength = temp;
                }
                System.out.print(iMg);
                x = sc.nextLine();
                x.trim();
                if (x.length() < minLength || x.length() > maxLength || x.isEmpty()) {
                    throw new Exception();
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter a string and length of string must be greater
     * than 0 character.
     *
     * @param iMg input message
     * @param eMg error message
     * @param con condition (T: true/F: false)
     * @return a string
     */
    public static String getString(String iMg, String eMg, String con) {
        String x;
        while (true) {
            try {
                System.out.print(iMg);
                x = sc.nextLine();
                if (con.equalsIgnoreCase("T") || con.equalsIgnoreCase("true")) {
                    if (x.length() == 0) {
                        throw new Exception();
                    }
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg);
            }
        }
    }

    /**
     * Method is used to print Loop
     *
     * @param num number to print message
     * @param pMg print message
     */
    public static void printLoop(int num, String pMg) {
        for (int i = 0; i < num; i++) {
            System.out.print(pMg);
        }
    }
}
