package br.edu.fafic.classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tratamento {
    Boolean verifica = false;
    Component parent = null;
    private java.awt.image.BufferedImage img;

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
        String novoCaminho = "";
        String nome = caminho;

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\bandaRed.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }
        return novoCaminho;
    }

    public String bandaGreen(String caminho) {
        String novoCaminho = "";
        String nome = caminho;

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\bandaGreen.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }
        return novoCaminho;

    }

    public String bandaBlue(String caminho) {
        String novoCaminho = "";
        String nome = caminho;

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\bandaBlue.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }
        return novoCaminho;

    }

    public String cinzaRed(String caminho) {
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\cinzaRed.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String cinzaGreen(String caminho) {
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\cinzaGreen.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String cinzaBlue(String caminho) {
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\cinzaBlue.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String cinzaMedia(String caminho) {
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\cinzaMedia.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public String negativoRGB(String caminho) {
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);

        BufferedImage imagem;
        try {
            imagem = ImageIO.read(new File(caminho));

            int w = imagem.getWidth();
            int h = imagem.getHeight();

            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    Color cor = new Color(imagem.getRGB(i, j));
                    int b = 255 - cor.getBlue();
                    int g = 255 - cor.getGreen();
                    int r = 255 - cor.getRed();

                    Color color = new Color(r, g, b);
                    imagem.setRGB(i, j, color.getRGB());
                }
            }
            ImageIO.write(imagem, "PNG", new File("negativoRGB.png"));
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\negativoRGB.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;

    }

    public double[][][] converteYIQ(String caminho) {
        String novoCaminho = "";
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
        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;

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
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\converteRGB.png";
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        } catch (NullPointerException n){
            JOptionPane.showMessageDialog(null, "Converta para YIQ antes de clicar!");
        }

        return caminho;
    }

    public String negativoY(double[][][] matrizYIQ, String caminho) {

        String novoCaminho = "";
        ImageIcon icon = new ImageIcon(caminho);
        BufferedImage imagem;

        try {
            imagem = ImageIO.read(new File(caminho));
            double[][][] matriz = converteYIQ(caminho);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j][0] = 255 - matriz[i][j][0];

                }
            }
            converterRGB(matriz,caminho);
            novoCaminho = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\ProjetoPdi\\ConverteRGB.png";
            verifica = true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem!");
        }

        return novoCaminho;
    }
}
