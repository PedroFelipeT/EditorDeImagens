package br.edu.fafic.classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tratamento {

    private Component parent = null;
    private java.awt.image.BufferedImage imagem;

    //Mudar essa parte da String para o caminho atual do projeto (Exemplo usando windows)
    private String caminhoInicial = "D:\\exemplo\\PhotoEdit\\EditorDeImagens";

    public void contarRGB(String caminho) {
        String nome = caminho;

        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(nome));
            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {
                    Color pixel = new Color(imagem.getRGB(col, lin));
                    int r = pixel.getRed();
                    int g = pixel.getGreen();
                    int b = pixel.getBlue();
                    System.out.println("Red: " + r + " Blue: " + b + " Green: " + b);

                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

    }

    public String bandaRed(String caminho) {
        String nome = caminho;
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(nome);
        JLabel label = new JLabel(icon);

        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(nome));
            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int r = pixel.getRed();
                    pixel = new Color(r, 0, 0);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("bandaRed.png"));
            novoCaminho = caminhoInicial + "\\bandaRed.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }
        return novoCaminho;
    }

    public String bandaGreen(String caminho) {
        String nome = caminho;
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(nome);
        JLabel label = new JLabel(icon);

        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(nome));
            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int g = pixel.getGreen();
                    pixel = new Color(0, g, 0);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("bandaGreen.png"));
            novoCaminho = caminhoInicial + "\\bandaGreen.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }
        return novoCaminho;

    }

    public String bandaBlue(String caminho) {
        String nome = caminho;
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(nome);
        JLabel label = new JLabel(icon);

        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(nome));
            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int b = pixel.getBlue();
                    pixel = new Color(0, 0, b);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("bandaBlue.png"));
            novoCaminho = caminhoInicial + "\\bandaBlue.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }
        return novoCaminho;

    }

    public String cinzaRed(String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        String novoCaminho = "";
        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int r = pixel.getRed();
                    pixel = new Color(r, r, r);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("cinzaRed.png"));
            novoCaminho = caminhoInicial + "\\cinzaRed.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String cinzaGreen(String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        String novoCaminho = "";
        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int g = pixel.getGreen();
                    pixel = new Color(g, g, g);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("cinzaGreen.png"));
            novoCaminho = caminhoInicial + "\\cinzaGreen.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String cinzaBlue(String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        String novoCaminho = "";
        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int b = pixel.getBlue();
                    pixel = new Color(b, b, b);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("cinzaBlue.png"));
            novoCaminho = caminhoInicial + "\\cinzaBlue.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String cinzaMedia(String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        String novoCaminho = "";
        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    Color pixel = new Color(imagem.getRGB(lin, col));
                    int r = pixel.getRed();
                    int g = pixel.getGreen();
                    int b = pixel.getBlue();
                    int media = (r + g + b) / 3;
                    pixel = new Color(media, media, media);
                    imagem.setRGB(lin, col, pixel.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("cinzaMedia.png"));
            novoCaminho = caminhoInicial + "\\cinzaMedia.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String negativoRGB(String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        String novoCaminho = "";
        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    Color cor = new Color(imagem.getRGB(i, j));
                    int r = 255 - cor.getRed();
                    int b = 255 - cor.getBlue();
                    int g = 255 - cor.getGreen();

                    Color color = new Color(r, g, b);
                    imagem.setRGB(i, j, color.getRGB());
                }
            }
            ImageIO.write(imagem, "PNG", new File("negativoRGB.png"));
            novoCaminho = caminhoInicial + "\\negativoRGB.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public double[][][] converteYIQ(String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        double matriz[][][] = new double[0][0][3];
        try {
            BufferedImage imagem;
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            matriz = new double[w][h][3];

            Color cor;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    cor = new Color(imagem.getRGB(i, j));
                    int b = cor.getBlue();
                    int g = cor.getGreen();
                    int r = cor.getRed();

                    double Y = (0.299 * r + 0.587 * g + 0.114 * b);
                    double I = (0.596 * r - 0.274 * g - 0.322 * b);
                    double Q = (0.211 * r - 0.523 * g + 0.312 * b);
                    matriz[i][j][0] = Y;
                    matriz[i][j][1] = I;
                    matriz[i][j][2] = Q;
                    //System.out.println("Valor de Y: " + matriz[i][j][0] + " Valor de I: " + matriz[i][j][1] + " Valor de Q: " + matriz[i][j][2]);
                }
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return matriz;

    }

    public String converterRGB(double[][][] matrizYIQ, String caminho) {

        double matriz[][][] = new double[0][0][3];
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";
        try {
            imagem = ImageIO.read(new File(caminho));
            for (int i = 0; i < matrizYIQ.length; i++) {
                for (int j = 0; j < matrizYIQ[i].length; j++) {

                    int r = (int) (1 * matrizYIQ[i][j][0] + 0.956 * matrizYIQ[i][j][1] + 0.621 * matrizYIQ[i][j][2]);
                    int g = (int) (1 * matrizYIQ[i][j][0] - 0.272 * matrizYIQ[i][j][1] - 0.647 * matrizYIQ[i][j][2]);
                    int b = (int) (1 * matrizYIQ[i][j][0] - 1.106 * matrizYIQ[i][j][1] + 1.703 * matrizYIQ[i][j][2]);

                    //Red
                    if (r > 255) {
                        r = 255;
                    } else if (r < 0) {
                        r = 0;
                    }

                    //Green
                    if (g > 255) {
                        g = 255;
                    } else if (g < 0) {
                        g = 0;
                    }

                    //Blue
                    if (b > 255) {
                        b = 255;
                    } else if (b < 0) {
                        b = 0;
                    }
                    Color color = new Color(r, g, b);
                    imagem.setRGB(i, j, color.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("converteRGB.png"));
            novoCaminho = caminhoInicial + "\\converteRGB.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "Converta para YIQ antes de clicar!");
        }

        return caminho;
    }

    public String negativoY(double[][][] matrizYIQ, String caminho) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";
        try {
            imagem = ImageIO.read(new File(caminho));
            double[][][] matriz = converteYIQ(caminho);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j][0] = 255 - matriz[i][j][0];

                }
            }
            converterRGB(matriz, caminho);
            novoCaminho = caminhoInicial + "\\ConverteRGB.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;
    }

    public static BufferedImage Mediana(BufferedImage image, int n) {

        int width = image.getWidth();
        int height = image.getHeight();
        int r[] = new int[n * n], g[] = new int[n * n], b[] = new int[n * n], i2 = 0, j2 = 0, cont;
        Color rgb;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                cont = 0;

                for (i2 = i - (n / 2); i2 <= i + (n / 2); i2++) {
                    for (j2 = j - (n / 2); j2 <= j + (n / 2); j2++) {

                        try {
                            r[cont] = new Color(image.getRGB(i2, j2)).getRed();
                            g[cont] = new Color(image.getRGB(i2, j2)).getGreen();
                            b[cont] = new Color(image.getRGB(i2, j2)).getBlue();
                            cont++;
                        } catch (ArrayIndexOutOfBoundsException a) {
                            r[cont] = g[cont] = b[cont] = 0;
                        }
                    }
                }
                Arrays.sort(r);
                Arrays.sort(g);
                Arrays.sort(b);
                rgb = new Color(r[r.length / 2], g[g.length / 2], b[b.length / 2]);
                image.setRGB(i, j, rgb.getRGB());
            }
        }
        return image;
    }

    public BufferedImage inserirRuidoGaussiano(BufferedImage imagem, double media, double variancia) {
        for (int i = 0; i < imagem.getHeight(); i++) {
            for (int j = 0; j < imagem.getWidth(); i++) {
                double a = Math.random();
                double b = Math.random();
                double x = Math.sqrt(-2 * Math.log(a)) * Math.cos(2 * Math.PI * b);

                double ruido = media + Math.sqrt(variancia) * x;
                int red = new Color(imagem.getRGB(j, j)).getRed();
                int green = new Color(imagem.getRGB(j, j)).getGreen();
                int blue = new Color(imagem.getRGB(j, j)).getBlue();
                int cor = (red + green + blue) / 3;

                double novaCor = (double) cor + ruido;
                if (novaCor > 255) {
                    novaCor = 255;
                } else if (novaCor < 0) {
                    novaCor = 0;
                }

                int novaCorInt = (int) Math.round(novaCor);
                imagem.setRGB(j, j, new Color(novaCorInt, novaCorInt, novaCorInt).getRGB());
            }
        }
        try {
            ImageIO.write(imagem, "jpeg", new File("imagem.jpeg"));
        } catch (IOException ex) {
            //Logger.getLogger(Ruido.class.getName()).log(Level.SEVERE, null, ex);
        }

        return imagem;
    }

    public String brilhoAddRGB(String caminho, int c) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));

            int width = imagem.getWidth();
            int height = imagem.getHeight();

            Color cor;

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    cor = new Color(imagem.getRGB(i, j));

                    //Red
                    int R = cor.getRed() + c;
                    if (R > 255) {
                        R = 255;
                    } else if (R < 0) {
                        R = 0;
                    }

                    //Green
                    int G = cor.getGreen() + c;
                    if (G > 255) {
                        G = 255;
                    } else if (G < 0) {
                        G = 0;
                    }

                    //Blue
                    int B = cor.getBlue() + c;
                    if (B > 255) {
                        B = 255;
                    } else if (B < 0) {
                        B = 0;
                    }

                    Color color = new Color(R, G, B);

                    imagem.setRGB(i, j, color.getRGB());

                }

            }
            ImageIO.write(imagem, "PNG", new File("brilhoADD.png"));
            novoCaminho = caminhoInicial + "\\brilhoADD.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    public String brilhoAddY(String caminho, int c) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            double[][][] matriz = converteYIQ(caminho);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j][0] = matriz[i][j][0] + c;
                }
            }
            converterRGB(matriz, caminho);
            ImageIO.write(imagem, "PNG", new File("brilhoAddY.png"));
            novoCaminho = caminhoInicial + "\\brilhoAddY.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    public String brilhoMTTRGB(String caminho, float c) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            int width = imagem.getWidth();
            int height = imagem.getHeight();

            Color cor;
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    cor = new Color(imagem.getRGB(i, j));

                    float R = cor.getRed() * c;
                    if (R > 255) {
                        R = 255;
                    } else if (R < 0) {
                        R = 0;
                    }

                    float G = cor.getGreen() * c;
                    if (G > 255) {
                        G = 255;
                    } else if (G < 0) {
                        G = 0;
                    }

                    float B = cor.getBlue() * c;
                    if (B > 255) {
                        B = 255;
                    } else if (B < 0) {
                        B = 0;
                    }

                    Color color = new Color((int) R, (int) G, (int) B);

                    imagem.setRGB(i, j, color.getRGB());

                }
            }
            ImageIO.write(imagem, "PNG", new File("brilhoMTTRGB.png"));
            novoCaminho = caminhoInicial + "\\brilhoMTTRGB.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    public String brilhoMTTY(String caminho, float c) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            double[][][] matriz = converteYIQ(caminho);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j][0] = matriz[i][j][0] * c;
                    if (matriz[i][j][0] > 255) {
                        matriz[i][j][0] = 255;
                    }
                    if (matriz[i][j][0] < 0) {
                        matriz[i][j][0] = 0;
                    }

                }
            }

            converterRGB(matriz, caminho);
            ImageIO.write(imagem, "PNG", new File("brilhoMTTY.png"));
            novoCaminho = caminhoInicial + "\\brilhoMTTY.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;

    }

    public String convolucao(String caminho, int kernel) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {

            imagem = ImageIO.read(new File(caminho));

            int width = imagem.getWidth();
            int height = imagem.getHeight();

            //double[] convTres = {0.0625, 0.125, 0.0625, 0.125, 0.25, 0.125, 0.0625, 0.125, 0.0625};
            double[] convTres = {0.11,0.11,0.11,0.11,0.11,0.11,0.11,0.11,0.11};
            double[] convCinco = {0.0039, 0.0156, 0.0234, 0.0156, 0.0039,
                0.0156, 0.0625, 0.0937, 0.0625, 0.0156,
                0.0234, 0.0937, 0.1406, 0.0937, 0.0234,
                0.0156, 0.0625, 0.0937, 0.0625, 0.0156,
                0.0039, 0.0156, 0.0234, 0.0156, 0.0039};

            int r = 0;
            int g = 0;
            int b = 0;

            for (int i = 0; i < imagem.getWidth() - 1; i++) {
                for (int j = 0; j < imagem.getHeight() - 1; j++) {
                    int[] red = new int[kernel * kernel];
                    int[] blue = new int[kernel * kernel];
                    int[] green = new int[kernel * kernel];
                    int c = 0;

                    if (!(i < (kernel / 2) || j < (kernel / 2) || i >= width - (kernel / 2) || j >= height - (kernel / 2))) {
                        for (int k = i - (kernel / 2); k <= i + (kernel / 2); k++) {
                            for (int l = j - (kernel / 2); l <= j + (kernel / 2); l++) {

                                Color cor = new Color(imagem.getRGB(k, l));
                                r = cor.getRed();
                                g = cor.getGreen();
                                b = cor.getBlue();

                                red[c] = r;
                                green[c] = g;
                                blue[c] = b;
                                c++;
                            }
                        }
                    }
                    int finalRed = 0;
                    int finalBlue = 0;
                    int finalGreen = 0;
                    if (kernel == 3) {
                        for (int a = 0; a < red.length; a++) {
                            finalRed += red[a] * convTres[a];
                            finalGreen += green[a] * convTres[a];
                            finalBlue += blue[a] * convTres[a];
                        }
                    }
                    if (kernel == 5) {
                        for (int a = 0; a < red.length; a++) {
                            finalRed += red[a] * convCinco[a];
                            finalGreen += green[a] * convCinco[a];
                            finalBlue += blue[a] * convCinco[a];
                        }
                    }
                    finalRed = Math.max(0, Math.min(255, finalRed));
                    finalGreen = Math.max(0, Math.min(255, finalGreen));
                    finalBlue = Math.max(0, Math.min(255, finalBlue));

                    Color color = new Color((int) finalRed, (int) finalGreen, (int) finalBlue);
                    imagem.setRGB(i, j, color.getRGB());
                }
            }
            ImageIO.write(imagem, "PNG", new File("convolucao.png"));
            novoCaminho = caminhoInicial + "\\convolucao.png";

        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    public String achandoMediana(String caminho, int kernel) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));

            int width = imagem.getWidth();
            int height = imagem.getHeight();

            int r[] = new int[kernel * kernel],
                    g[] = new int[kernel * kernel],
                    b[] = new int[kernel * kernel],
                    i2 = 0, j2 = 0, cont;

            Color rgb;

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    cont = 0;

                    for (i2 = i - (kernel / 2); i2 <= i + (kernel / 2); i2++) {
                        for (j2 = j - (kernel / 2); j2 <= j + (kernel / 2); j2++) {

                            try {
                                r[cont] = new Color(imagem.getRGB(i2, j2)).getRed();
                                g[cont] = new Color(imagem.getRGB(i2, j2)).getGreen();
                                b[cont] = new Color(imagem.getRGB(i2, j2)).getBlue();
                                cont++;

                            } catch (ArrayIndexOutOfBoundsException a) {
                                r[cont] = g[cont] = b[cont] = 0;
                            }

                        }
                    }

                    Arrays.sort(r);
                    Arrays.sort(g);
                    Arrays.sort(b);

                    rgb = new Color(r[r.length / 2], g[g.length / 2], b[b.length / 2]);
                    imagem.setRGB(i, j, rgb.getRGB());
                }

            }
            ImageIO.write(imagem, "PNG", new File("mediana.png"));
            novoCaminho = caminhoInicial + "\\mediana.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;

    }

    public String achandoModa(String caminho, int mascara) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            BufferedImage img = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

            int width = imagem.getWidth();
            int height = imagem.getHeight();

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int r = 0;
                    int g = 0;
                    int b = 0;
                    int[] red = new int[mascara * mascara];
                    int[] green = new int[mascara * mascara];
                    int[] blue = new int[mascara * mascara];
                    int c = 0;

                    if (!(i < (mascara / 2) || j < (mascara / 2) || i >= width - (mascara / 2) || j >= height - (mascara / 2))) {
                        for (int k = i - (mascara / 2); k <= i + (mascara / 2); k++) {
                            for (int l = j - (mascara / 2); l <= j + (mascara / 2); l++) {

                                Color cor = new Color(imagem.getRGB(k, l));
                                r = cor.getRed();
                                g = cor.getGreen();
                                b = cor.getBlue();

                                red[c] = r;
                                blue[c] = b;
                                green[c] = g;
                                c++;
                            }
                        }
                    }
                    Arrays.sort(red);
                    Arrays.sort(blue);
                    Arrays.sort(green);

                    int qntAux = 1;
                    int moda = 0;
                    int posicaoR = 0;
                    int posicaoG = 0;
                    for (int a = 0; a < red.length - 1; a++) {
                        for (int z = 1; z > red.length; z++) {
                            if (red[a] == red[z]) {
                                qntAux++;
                            }
                        }
                        if (qntAux > moda) {
                            moda = qntAux;
                            posicaoR = a;
                        }
                        qntAux = 1;
                    }
                    qntAux = 1;
                    moda = 0;

                    for (int a = 0; a < green.length - 1; a++) {
                        for (int z = 1; z > green.length; z++) {
                            if (green[a] == green[z]) {
                                qntAux++;
                            }
                        }
                        if (qntAux > moda) {
                            moda = qntAux;
                            posicaoG = a;
                        }
                        qntAux = 1;
                    }
                    qntAux = 1;
                    moda = 0;
                    int posicaoB = 0;

                    for (int a = 0; a < blue.length - 1; a++) {
                        for (int z = 1; z > blue.length; z++) {
                            if (blue[a] == blue[z]) {
                                qntAux++;
                            }
                        }
                        if (qntAux > moda) {
                            moda = qntAux;
                            posicaoB = a;
                        }
                        qntAux = 1;
                    }
                    Color color = new Color(red[posicaoR], green[posicaoG], blue[posicaoB]);
                    img.setRGB(i, j, color.getRGB());
                }
            }
            ImageIO.write(img, "PNG", new File("moda.png"));
            novoCaminho = caminhoInicial + "\\moda.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    public String ruidoDeMetodo(String caminho1, String caminho2) {
        BufferedImage semRuido;
        BufferedImage comRuido;
        String novoCaminho = "";

        try {
            semRuido = ImageIO.read(new File(caminho1));
            comRuido = ImageIO.read(new File(caminho2));

            int w = semRuido.getWidth();
            int h = semRuido.getHeight();

            for (int lin = 0; lin < w; lin++) {
                for (int col = 0; col < h; col++) {
                    int r =comRuido.getRGB(lin, col) -semRuido.getRGB(lin, col);
                    Color color = new Color(r);
                    semRuido.setRGB(lin, col, color.getRGB());
                }
            }
            ImageIO.write(semRuido, "PNG", new File("ruido.png"));
            novoCaminho = caminhoInicial + "\\ruido.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;

    }

    public String saltAndPepper(String caminho, double porcentagem) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            int pixels = imagem.getHeight() * imagem.getWidth();
            double quantidadePixel = (porcentagem / 100) * pixels;

            double pixelBranco = quantidadePixel / 2;
            double pixelPreto = quantidadePixel / 2;
            Random random = new Random();

            for (double a = 0; a < pixelBranco; a++) {
                Color cor = new Color(255, 255, 255);
                imagem.setRGB(random.nextInt(imagem.getHeight()), random.nextInt(imagem.getWidth()), cor.getRGB());
            }
            for (double b = 0; b < pixelPreto; b++) {
                Color cor2 = new Color(0, 0, 0);
                imagem.setRGB(random.nextInt(imagem.getHeight()), random.nextInt(imagem.getWidth()), cor2.getRGB());
            }
            ImageIO.write(imagem, "PNG", new File("salEpimenta.png"));
            novoCaminho = caminhoInicial + "\\salEpimenta.png";

        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    private BufferedImage escalaCinza(BufferedImage imagem) {

        int width = imagem.getWidth();
        int height = imagem.getHeight();
        int media = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color cor = new Color(imagem.getRGB(i, j));
                media = (cor.getRed() + cor.getGreen() + cor.getBlue()) / 3;
                Color color = new Color(media, media, media);
                imagem.setRGB(i, j, color.getRGB());
            }
        }
        return imagem;
    }

    public String binarizarImagem(String caminho, int as) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            imagem = escalaCinza(imagem);

            int width = imagem.getWidth();
            int height = imagem.getHeight();
            int media = 0;

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int rgb = imagem.getRGB(i, j);

                    Color cor = new Color(rgb);
                    int r = cor.getRed();
                    int g = cor.getGreen();
                    int b = cor.getBlue();

                    media = (r + g + b) / 3;

                    if (media > as) {
                        media = 255;
                    } else if (media < as) {
                        media = 0;
                    }

                    Color color = new Color(media, media, media);
                    imagem.setRGB(i, j, color.getRGB());
                }
            }
            ImageIO.write(imagem, "PNG", new File("binarizar.png"));
            novoCaminho = caminhoInicial + "\\binarizar.png";
        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return novoCaminho;
    }

    public String aumentoDaTonalidade(String caminho, int incrementar, String banda) {
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;
        String novoCaminho = "";

        try {
            imagem = ImageIO.read(new File(caminho));
            int height = imagem.getHeight();
            int width = imagem.getWidth();

            for (int w = 0; w < width; w++) {
                for (int h = 0; h < height; h++) {
                    Color cor = new Color(imagem.getRGB(w, h));
                    int red = cor.getRed();
                    int green = cor.getGreen();
                    int blue = cor.getBlue();

                    if (banda.equals("Red")) {
                        red += incrementar;
                        if (red > 255) {
                            red = 255;
                        } else if (red < 0) {
                            red = 0;
                        }
                    } else if (banda.equals("Green")) {
                        green += incrementar;
                        if (green > 255) {
                            green = 255;
                        } else if (green < 0) {
                            green = 0;
                        }
                    } else if (banda.equals("Blue")) {
                        blue += incrementar;
                        if (blue > 255) {
                            blue = 255;
                        } else if (blue < 0) {
                            blue = 0;
                        }
                    }

                    Color maiorTonalidade = new Color(red, green, blue);
                    imagem.setRGB(w, h, maiorTonalidade.getRGB());
                }

            }
            ImageIO.write(imagem, "PNG", new File("tonalidade.png"));
            novoCaminho = caminhoInicial + "\\tonalidade.png";

        } catch (IOException ex) {
            Logger.getLogger(Tratamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return novoCaminho;
    }

}
