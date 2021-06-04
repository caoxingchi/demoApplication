package site.xingchi.pojo;


public class Music {
    /**
     * 编号
     */
    private long id;
    /**
     * 歌手
     */
    private String singer;
    /**
     * 歌曲名
     */
    private String songName;
    /**
     * 专辑
     */
    private String album;
    /**
     * 专辑图片
     */
    private String album_art;
    /**
     * 歌曲地址
     */
    private String path;
    /**
     * 歌曲长度
     */
    private long duration;
    /**
     * 歌曲大小
     */
    private long size;

    //是否正在播放
    private boolean isPlaying;
    //当前的播放进度
    private long currentPlayProgress;

    private int currentPosition;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum_art() {
        return album_art;
    }

    public void setAlbum_art(String album_art) {
        this.album_art = album_art;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public long getCurrentPlayProgress() {
        return currentPlayProgress;
    }

    public void setCurrentPlayProgress(long currentPlayProgress) {
        this.currentPlayProgress = currentPlayProgress;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
