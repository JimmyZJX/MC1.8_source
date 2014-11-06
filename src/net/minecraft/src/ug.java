package net.minecraft.src;
/*   1:    */ import java.io.UnsupportedEncodingException;
/*   2:    */ import java.security.GeneralSecurityException;
/*   3:    */ import java.security.InvalidKeyException;
/*   4:    */ import java.security.Key;
/*   5:    */ import java.security.KeyFactory;
/*   6:    */ import java.security.KeyPair;
/*   7:    */ import java.security.KeyPairGenerator;
/*   8:    */ import java.security.MessageDigest;
/*   9:    */ import java.security.NoSuchAlgorithmException;
/*  10:    */ import java.security.PrivateKey;
/*  11:    */ import java.security.PublicKey;
/*  12:    */ import java.security.spec.InvalidKeySpecException;
/*  13:    */ import java.security.spec.X509EncodedKeySpec;
/*  14:    */ import javax.crypto.BadPaddingException;
/*  15:    */ import javax.crypto.Cipher;
/*  16:    */ import javax.crypto.IllegalBlockSizeException;
/*  17:    */ import javax.crypto.KeyGenerator;
/*  18:    */ import javax.crypto.NoSuchPaddingException;
/*  19:    */ import javax.crypto.SecretKey;
/*  20:    */ import javax.crypto.spec.IvParameterSpec;
/*  21:    */ import javax.crypto.spec.SecretKeySpec;
/*  22:    */ import org.apache.logging.log4j.LogManager;
/*  23:    */ import org.apache.logging.log4j.Logger;
/*  24:    */ 
/*  25:    */ public class ug
/*  26:    */ {
/*  27: 16 */   private static final Logger a = LogManager.getLogger();
/*  28:    */   
/*  29:    */   public static SecretKey a()
/*  30:    */   {
/*  31:    */     try
/*  32:    */     {
/*  33: 27 */       KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
/*  34: 28 */       localKeyGenerator.init(128);
/*  35: 29 */       return localKeyGenerator.generateKey();
/*  36:    */     }
/*  37:    */     catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
/*  38:    */     {
/*  39: 31 */       throw new Error(localNoSuchAlgorithmException);
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public static KeyPair b()
/*  44:    */   {
/*  45:    */     try
/*  46:    */     {
/*  47: 37 */       KeyPairGenerator localKeyPairGenerator = KeyPairGenerator.getInstance("RSA");
/*  48: 38 */       localKeyPairGenerator.initialize(1024);
/*  49:    */       
/*  50: 40 */       return localKeyPairGenerator.generateKeyPair();
/*  51:    */     }
/*  52:    */     catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
/*  53:    */     {
/*  54: 42 */       localNoSuchAlgorithmException.printStackTrace();
/*  55:    */       
/*  56: 44 */       a.error("Key pair generation failed!");
/*  57:    */     }
/*  58: 45 */     return null;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public static byte[] a(String paramString, PublicKey paramPublicKey, SecretKey paramSecretKey)
/*  62:    */   {
/*  63:    */     try
/*  64:    */     {
/*  65: 50 */       return a("SHA-1", new byte[][] { paramString.getBytes("ISO_8859_1"), paramSecretKey.getEncoded(), paramPublicKey.getEncoded() });
/*  66:    */     }
/*  67:    */     catch (UnsupportedEncodingException localUnsupportedEncodingException)
/*  68:    */     {
/*  69: 57 */       localUnsupportedEncodingException.printStackTrace();
/*  70:    */     }
/*  71: 60 */     return null;
/*  72:    */   }
/*  73:    */   
/*  74:    */   private static byte[] a(String paramString, byte[]... paramVarArgs)
/*  75:    */   {
/*  76:    */     try
/*  77:    */     {
/*  78: 65 */       MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
/*  79: 66 */       for (byte[] arrayOfByte1 : paramVarArgs) {
/*  80: 67 */         localMessageDigest.update(arrayOfByte1);
/*  81:    */       }
/*  82: 69 */       return localMessageDigest.digest();
/*  83:    */     }
/*  84:    */     catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
/*  85:    */     {
/*  86: 71 */       localNoSuchAlgorithmException.printStackTrace();
/*  87:    */     }
/*  88: 74 */     return null;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public static PublicKey a(byte[] paramArrayOfByte)
/*  92:    */   {
/*  93:    */     try
/*  94:    */     {
/*  95: 79 */       X509EncodedKeySpec localX509EncodedKeySpec = new X509EncodedKeySpec(paramArrayOfByte);
/*  96: 80 */       KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
/*  97: 81 */       return localKeyFactory.generatePublic(localX509EncodedKeySpec);
/*  98:    */     }
/*  99:    */     catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}catch (InvalidKeySpecException localInvalidKeySpecException) {}
/* 100: 85 */     a.error("Public key reconstitute failed!");
/* 101: 86 */     return null;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public static SecretKey a(PrivateKey paramPrivateKey, byte[] paramArrayOfByte)
/* 105:    */   {
/* 106: 90 */     return new SecretKeySpec(b(paramPrivateKey, paramArrayOfByte), "AES");
/* 107:    */   }
/* 108:    */   
/* 109:    */   public static byte[] a(Key paramKey, byte[] paramArrayOfByte)
/* 110:    */   {
/* 111: 94 */     return a(1, paramKey, paramArrayOfByte);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public static byte[] b(Key paramKey, byte[] paramArrayOfByte)
/* 115:    */   {
/* 116: 98 */     return a(2, paramKey, paramArrayOfByte);
/* 117:    */   }
/* 118:    */   
/* 119:    */   private static byte[] a(int paramInt, Key paramKey, byte[] paramArrayOfByte)
/* 120:    */   {
/* 121:    */     try
/* 122:    */     {
/* 123:103 */       return a(paramInt, paramKey.getAlgorithm(), paramKey).doFinal(paramArrayOfByte);
/* 124:    */     }
/* 125:    */     catch (IllegalBlockSizeException localIllegalBlockSizeException)
/* 126:    */     {
/* 127:105 */       localIllegalBlockSizeException.printStackTrace();
/* 128:    */     }
/* 129:    */     catch (BadPaddingException localBadPaddingException)
/* 130:    */     {
/* 131:107 */       localBadPaddingException.printStackTrace();
/* 132:    */     }
/* 133:109 */     a.error("Cipher data failed!");
/* 134:110 */     return null;
/* 135:    */   }
/* 136:    */   
/* 137:    */   private static Cipher a(int paramInt, String paramString, Key paramKey)
/* 138:    */   {
/* 139:    */     try
/* 140:    */     {
/* 141:115 */       Cipher localCipher = Cipher.getInstance(paramString);
/* 142:116 */       localCipher.init(paramInt, paramKey);
/* 143:117 */       return localCipher;
/* 144:    */     }
/* 145:    */     catch (InvalidKeyException localInvalidKeyException)
/* 146:    */     {
/* 147:119 */       localInvalidKeyException.printStackTrace();
/* 148:    */     }
/* 149:    */     catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
/* 150:    */     {
/* 151:121 */       localNoSuchAlgorithmException.printStackTrace();
/* 152:    */     }
/* 153:    */     catch (NoSuchPaddingException localNoSuchPaddingException)
/* 154:    */     {
/* 155:123 */       localNoSuchPaddingException.printStackTrace();
/* 156:    */     }
/* 157:125 */     a.error("Cipher creation failed!");
/* 158:126 */     return null;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public static Cipher a(int paramInt, Key paramKey)
/* 162:    */   {
/* 163:    */     try
/* 164:    */     {
/* 165:131 */       Cipher localCipher = Cipher.getInstance("AES/CFB8/NoPadding");
/* 166:132 */       localCipher.init(paramInt, paramKey, new IvParameterSpec(paramKey.getEncoded()));
/* 167:133 */       return localCipher;
/* 168:    */     }
/* 169:    */     catch (GeneralSecurityException localGeneralSecurityException)
/* 170:    */     {
/* 171:135 */       throw new RuntimeException(localGeneralSecurityException);
/* 172:    */     }
/* 173:    */   }
/* 174:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ug
 * JD-Core Version:    0.7.0.1
 */