package net.minecraft.src;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;

public abstract interface czz
{
  public abstract void a(ErrorCode paramErrorCode, AuthToken paramAuthToken);
  
  public abstract void a(ErrorCode paramErrorCode);
  
  public abstract void a(ErrorCode paramErrorCode, GameInfo[] paramArrayOfGameInfo);
  
  public abstract void a(czy paramczy);
  
  public abstract void a();
  
  public abstract void a(StreamInfo paramStreamInfo);
  
  public abstract void a(IngestList paramIngestList);
  
  public abstract void b(ErrorCode paramErrorCode);
  
  public abstract void b();
  
  public abstract void c();
  
  public abstract void c(ErrorCode paramErrorCode);
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czz
 * JD-Core Version:    0.7.0.1
 */