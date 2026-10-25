import { useState } from 'react';

function App() {
  const [musteriAdi, setMusteriAdi] = useState('');
  const [rezervasyonlar, setRezervasyonlar] = useState<string[]>([]);
  const rezervasyonYap = (e) => {
    e.preventDefault();
    if (!musteriAdi.trim()) return;
    //Yığına ekleme
    setRezervasyonlar([...rezervasyonlar, musteriAdi]);
    alert(musteriAdi + " için rezervasyon oluşturuldu.");
    setMusteriAdi('');
  };
  //Geri alma
  const geriAl = () => {
    if (rezervasyonlar.length === 0) {
      alert("Geri alınacak işlem yok");
      return;
    }
    const yeniListe = [...rezervasyonlar];
    const cikarilan = yeniListe.pop();
    setRezervasyonlar(yeniListe);
    alert(cikarilan + " için yapılan rezervasyon geri alındı");
  };
  return (
    <div className='flex flex-col items-center justify-center h-screen'>
      <div className='w-full h-fit p-4 flex items-center justify-center bg-[#f0ebe0] font-bold text-blue-500 text-lg border-b-2'>Otel Rezervasyon</div>

      <div className='flex w-full h-full justify-center items-center bg-[#e8e7e7]'>
        {/*--Yağmur ve SametK görevi--*/}
        <div className='flex flex-col w-fit h-fit bg-[#f0ebe0] shadow-lg text-black p-5 rounded-2xl gap-5'>
          <h3 className='text-2xl'> Rezervasyon Paneli</h3>

          {/*REZERVASYON EKLEME FORMU*/}
          <form onSubmit={rezervasyonYap}>
            <div className='flex flex-col gap-4'>
              <div>
                Müşteri Ad/Soyad:
              </div>
              <input
                type='text'
                value={musteriAdi}
                onChange={(e) => setMusteriAdi(e.target.value)}
                placeholder='Adınızı Giriniz'
                className='w-full rounded-xl border border-gray-300 bg-white px-4 py-3 text-gray-700 outline-none transition-all'></input>
              <button type='submit' className='bg-green-500 rounded-2xl p-2 text-white hover:bg-green-700 cursor-pointer transition-all'>
                Kaydet
              </button>
            </div>
          </form>
          {/* ALT MENÜ (GERİ AL/ KAYDET)*/}
          <div className='flex flex-1 gap-2'>
            <button className='bg-blue-500 text-white p-2 rounded-2xl cursor-pointer hover:bg-blue-700 transition-all'>
              Dosyaya Kaydet
            </button>
            <button
              type='button'
              onClick={geriAl}
              className='bg-red-600 text-white p-2 rounded-2xl cursor-pointer hover:bg-red-900 transition-all'
            >
              Geri Al
            </button>
          </div>

          {/* AKTİF REZERVASYON LİSTESİ*/}
          <div className='bg-white rounded-lg w-fit h-fit p-3'>
            <h4 className='text-lg w-50'>Aktif Rezervasyonlar :</h4>
            {rezervasyonlar.length === 0 ? (
              <p className='text-gray-400'>Eklenen rezervasyon yok</p>
            ) : (
              <ul className='text-gray-500'>{rezervasyonlar.map((rez, index) => (
                <li key={index} > {index+1+"-"+rez} </li>
              ))}
              </ul>
            )}
          </div>
        </div >

      </div>
    </div >
  );
}
export default App