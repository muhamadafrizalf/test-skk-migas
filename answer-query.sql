--Jawaban Nomor 4a
select * 
from barang 
where harga > 10000
order by harga asc ;

--Jawaban Nomor 4b
select *
from pelanggan
where
	nama ilike '%g%' and 
	alamat = 'BANDUNG';

--Jawaban Nomor 4c
select
	t.kode,
	t.tanggal,
	p.nama as nama_pelanggan,
	b.nama as nama_barang,
	t.jumlah_barang as jumlah,
	b.harga as harga_satuan,
	b.harga * t.jumlah_barang as total
from transaksi t 
join pelanggan p on p.kode = t.kode_pelanggan 
join barang b on b.kode = t.kode_barang
order by p.nama, t.tanggal ;

--Jawaban Nomor 4d
select
	p.nama as nama_pelanggan,
	sum(t.jumlah_barang) as jumlah,
	sum(b.harga * t.jumlah_barang) as total_harga
from transaksi t 
join pelanggan p on p.kode = t.kode_pelanggan 
join barang b on b.kode = t.kode_barang
group by p.nama 
order by p.nama ;


