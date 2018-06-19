package pattern.adapter;

import java.io.IOException;

/**
 * @author : Lin Can
 * @description : 定义一个适配器，用于将旧的Computer转换为实现Closeable接口
 * @modified ：By
 * @date : 2018/5/18 9:23
 */
public class CloseableComputer implements AutoCloseable {
    private Computer computer;

    public CloseableComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void close() throws IOException {
        this.computer.close();
    }
}
