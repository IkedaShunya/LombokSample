package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Dataゲッター、セッター、equals(),hasCode(),toString()が自動的作成される
@Data
//@AllArgsConstructorはクラスのすべてのフィールドを引数として持つコンストラクタを自動的に生成します。
@AllArgsConstructor
//NoArgsConstructorは引数を持たないデフォルトコンストラクタを自動的に生成します。
@NoArgsConstructor
public class User {
//	名前
	private String name;
//	年齢
	private int age;


}
