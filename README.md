## 视频压缩, 修改自 [SiliCompressor](https://github.com/Tourenathan-G5organisation/SiliCompressor).

1. 修复宽高不变只改码率时视频无法播放的问题.
2. 输出路径自己指定.
3. 取消单例, 支持并发.

已知问题
1. mp4 moov 标志在文件尾部, 没有办法快速打开.