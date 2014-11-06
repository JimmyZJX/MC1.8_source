package net.minecraft.src;
/*   1:    */ import java.io.BufferedInputStream;
/*   2:    */ import java.io.BufferedOutputStream;
/*   3:    */ import java.io.DataInput;
/*   4:    */ import java.io.DataInputStream;
/*   5:    */ import java.io.DataOutput;
/*   6:    */ import java.io.DataOutputStream;
/*   7:    */ import java.io.File;
/*   8:    */ import java.io.FileInputStream;
/*   9:    */ import java.io.FileOutputStream;
/*  10:    */ import java.io.IOException;
/*  11:    */ import java.io.InputStream;
/*  12:    */ import java.io.OutputStream;
/*  13:    */ import java.util.zip.GZIPInputStream;
/*  14:    */ import java.util.zip.GZIPOutputStream;
/*  15:    */ 
/*  16:    */ public class fz
/*  17:    */ {
/*  18:    */   public static NBTTagCompound a(InputStream paramInputStream) throws IOException
/*  19:    */   {
/*  20: 13 */     DataInputStream localDataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(paramInputStream)));
/*  21:    */     try
/*  22:    */     {
/*  23: 15 */       return a(localDataInputStream, fx.a);
/*  24:    */     }
/*  25:    */     finally
/*  26:    */     {
/*  27: 17 */       localDataInputStream.close();
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public static void a(NBTTagCompound paramfn, OutputStream paramOutputStream) throws IOException
/*  32:    */   {
/*  33: 22 */     DataOutputStream localDataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(paramOutputStream)));
/*  34:    */     try
/*  35:    */     {
/*  36: 24 */       a(paramfn, (DataOutput)localDataOutputStream);
/*  37:    */     }
/*  38:    */     finally
/*  39:    */     {
/*  40: 26 */       localDataOutputStream.close();
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public static void a(NBTTagCompound paramfn, File paramFile) throws IOException
/*  45:    */   {
/*  46: 31 */     File localFile = new File(paramFile.getAbsolutePath() + "_tmp");
/*  47: 32 */     if (localFile.exists()) {
/*  48: 33 */       localFile.delete();
/*  49:    */     }
/*  50: 35 */     b(paramfn, localFile);
/*  51: 36 */     if (paramFile.exists()) {
/*  52: 37 */       paramFile.delete();
/*  53:    */     }
/*  54: 39 */     if (paramFile.exists()) {
/*  55: 40 */       throw new IOException("Failed to delete " + paramFile);
/*  56:    */     }
/*  57: 42 */     localFile.renameTo(paramFile);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public static void b(NBTTagCompound paramfn, File paramFile) throws IOException
/*  61:    */   {
/*  62: 46 */     DataOutputStream localDataOutputStream = new DataOutputStream(new FileOutputStream(paramFile));
/*  63:    */     try
/*  64:    */     {
/*  65: 48 */       a(paramfn, (DataOutput)localDataOutputStream);
/*  66:    */     }
/*  67:    */     finally
/*  68:    */     {
/*  69: 50 */       localDataOutputStream.close();
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   public static NBTTagCompound a(File paramFile) throws IOException
/*  74:    */   {
/*  75: 55 */     if (!paramFile.exists()) {
/*  76: 56 */       return null;
/*  77:    */     }
/*  78: 58 */     DataInputStream localDataInputStream = new DataInputStream(new FileInputStream(paramFile));
/*  79:    */     try
/*  80:    */     {
/*  81: 60 */       return a(localDataInputStream, fx.a);
/*  82:    */     }
/*  83:    */     finally
/*  84:    */     {
/*  85: 62 */       localDataInputStream.close();
/*  86:    */     }
/*  87:    */   }
/*  88:    */   
/*  89:    */   public static NBTTagCompound a(DataInputStream paramDataInputStream) throws IOException
/*  90:    */   {
/*  91: 67 */     return a(paramDataInputStream, fx.a);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public static NBTTagCompound a(DataInput paramDataInput, fx paramfx) throws IOException
/*  95:    */   {
/*  96: 71 */     NBTBase localgd = a(paramDataInput, 0, paramfx);
/*  97: 72 */     if ((localgd instanceof NBTTagCompound)) {
/*  98: 73 */       return (NBTTagCompound)localgd;
/*  99:    */     }
/* 100: 75 */     throw new IOException("Root tag must be a named compound tag");
/* 101:    */   }
/* 102:    */   
/* 103:    */   public static void a(NBTTagCompound paramfn, DataOutput paramDataOutput) throws IOException
/* 104:    */   {
/* 105: 79 */     a((NBTBase)paramfn, paramDataOutput);
/* 106:    */   }
/* 107:    */   
/* 108:    */   private static void a(NBTBase paramgd, DataOutput paramDataOutput) throws IOException
/* 109:    */   {
/* 110: 83 */     paramDataOutput.writeByte(paramgd.a());
/* 111: 84 */     if (paramgd.a() == 0) {
/* 112: 85 */       return;
/* 113:    */     }
/* 114: 89 */     paramDataOutput.writeUTF("");
/* 115:    */     
/* 116: 91 */     paramgd.a(paramDataOutput);
/* 117:    */   }
/* 118:    */   
/* 119:    */   private static NBTBase a(DataInput paramDataInput, int paramInt, fx paramfx) throws IOException
/* 120:    */   {
/* 121: 95 */     byte b = paramDataInput.readByte();
/* 122: 96 */     if (b == 0) {
/* 123: 97 */       return new fr();
/* 124:    */     }
/* 125:101 */     paramDataInput.readUTF();
/* 126:    */     
/* 127:103 */     NBTBase localgd = NBTBase.a(b);
/* 128:    */     try
/* 129:    */     {
/* 130:106 */       localgd.a(paramDataInput, paramInt, paramfx);
/* 131:    */     }
/* 132:    */     catch (IOException localIOException)
/* 133:    */     {
/* 134:108 */       b localb = net.minecraft.src.b.a(localIOException, "Loading NBT data");
/* 135:109 */       j localj = localb.a("NBT Tag");
/* 136:110 */       localj.a("Tag name", "[UNNAMED TAG]");
/* 137:111 */       localj.a("Tag type", Byte.valueOf(b));
/* 138:112 */       throw new u(localb);
/* 139:    */     }
/* 140:115 */     return localgd;
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fz
 * JD-Core Version:    0.7.0.1
 */