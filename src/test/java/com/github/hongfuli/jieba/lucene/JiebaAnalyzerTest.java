package com.github.hongfuli.jieba.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.BaseTokenStreamTestCase;

import java.io.IOException;
import java.util.Random;

/**
 * Created by lihongfu on 17/6/19.
 */
public class JiebaAnalyzerTest extends BaseTokenStreamTestCase {

    public void testStandardAnalyzer() throws IOException {
        Analyzer analyzer = new JiebaAnalyzer();

        checkRandomData(new Random(0), analyzer, 1);

        System.out.println(BaseTokenStreamTestCase.toString(analyzer, "工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作"));
        System.out.println("==============");
        System.out.println(BaseTokenStreamTestCase.toString(analyzer, "hello  world,this is my first program"));
        System.out.println("==============");
        System.out.println(BaseTokenStreamTestCase.toString(analyzer, "这是一个伸手不见五指的黑夜。我叫孙悟空，我爱北京，我爱Python和C++。"));

    }


}