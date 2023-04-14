package br.com.partypass.util;

import br.com.partypass.entidade.Cliente;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyQRCode {
    // Function to create the QR code

    public static void createQR(String data, String path,
            String charset, Map hashMap,
            int height, int width)
            throws WriterException, IOException {

        BitMatrix matrix = new MultiFormatWriter().encode(
                new String(data.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, width, height);

        MatrixToImageWriter.writeToFile(
                matrix,
                path.substring(path.lastIndexOf('.') + 1),
                new File(path));
    }

    public static void createQRCodeForClient(Cliente cliente, String path) throws WriterException, IOException {
        String data = "Nome: " + cliente.getNome() + "\n"
                + "CPF: " + cliente.getCpf() + "\n"
                + "Telefone: " + cliente.getTelefone();

        String charset = "UTF-8";

        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<>();
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        createQR(data, path, charset, hashMap, 200, 200);
    }

//    // Driver code
//    public static void main(String[] args)
//        throws WriterException, IOException,
//               NotFoundException
//    {
// 
//        // The data that the QR code will contain
//        String data = "www.geeksforgeeks.org";
// 
//        // The path where the image will get saved
//        String path = "demo.png";
// 
//        // Encoding charset
//        String charset = "UTF-8";
// 
//        Map<EncodeHintType, ErrorCorrectionLevel> hashMap
//            = new HashMap<EncodeHintType,
//                          ErrorCorrectionLevel>();
// 
//        hashMap.put(EncodeHintType.ERROR_CORRECTION,
//                    ErrorCorrectionLevel.L);
// 
//        // Create the QR code and save
//        // in the specified folder
//        // as a jpg file
//        createQR(data, path, charset, hashMap, 200, 200);
//        System.out.println("QR Code Generated!!! ");
//    }
}
