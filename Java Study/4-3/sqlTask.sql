/* ■ [回答]と記載のある箇所へ、1〜8の各課題内容に沿ったSQL文を記述しなさい。 */
 
-- 1. 店舗テーブルから店舗名を抽出しなさい。また、列名の表示は別名で'店舗名'とすること。
-- [回答]
 select store_name from store_table
 select store_name as 店舗名 from store_table
 
-- 2. 店舗情報を店舗名のABC順に抽出しなさい。
-- [回答]
 select * from store_table order by store_nameABC asc
 
-- 3. 在庫テーブルに店舗テーブル、商品テーブルを「内部結合」し、店舗名・商品名・在庫数を全て取得しなさい。
-- [回答]
 select quantity,store_name,goods_name from stock_table
join store_table on cast (stock_table.quantity as varchar) < store_table.store_name
join goods_table on cast (stock_table.quantity as varchar) < goods_table.goods_name

 
-- 4. 商品テーブルから全商品の単価の平均値を抽出しなさい。
-- [回答]
 select avg(price) from goods_table
 
-- 5. 店舗コード='EA01'の在庫数の平均値より大きい在庫数を持つ店舗コードを抽出しなさい。
-- [回答]
/*1*/select avg(quantity) from stock_table where store_code = 'EA01'/*これでEA01だけの平均値が求まる 平均値17.3*/
/*2*/select quantity from stocktable where qunatity >= 17.3

/*または*/
/*サブクエリを使用した場合*/
select store_code,quantity from stock_table
	where quantity > any (select avg(quantity) from stock_table where store_code = 'EA01')
 
-- 6. 商品テーブルに「商品コード='M001'、商品名='マフラー'、単価=4500円、更新日付=本日日付」のデータを追加しなさい。※実行後のSELECT結果も貼付すること。
-- [回答]
 insert into goods_table
(goods_code,goods_name,price,update_day)
values
('M001','マフラー',4500,'2021-1-25')
 
-- 7. 在庫テーブルの商品コード='S987'、かつ、店舗コード='EA01'に対して、「在庫数=10、更新日付=本日日付」で更新しなさい。※実行後のSELECT結果も貼付すること。
-- [回答]
 update stock_table
set quantity=10,update_day='2021-01-25'
where goods_code='S987' and store_code='EA01'
 
-- 8. 7で更新した商品を削除しなさい。※実行後のSELECT結果も貼付すること。
delete from stock_table
where goods_code='S987' and store_code='EA01'