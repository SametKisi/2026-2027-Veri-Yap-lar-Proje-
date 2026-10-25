import React, { useState } from 'react';

function App() {
  const [musteriAdi, setMusteriAdi] = useState('');
  const [rezervasyonlar, setRezervasyonlar] = useState<string[]>([]);
  const rezervasyonYap = (e: React.FormEvent) => {
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
    <div style={{ padding: '20px 0', fontFamily: 'Arial' }} >
      <div>App</div>
      <hr style={{ margin: '20px 0' }} />

      {/*--Yağmur'un görevi--*/}
      <div style={{ border: '1px solid #3b82f6', padding: '20px', borderRadius: '8px', background: '#f8fafc' }}>
        <h3 style={{ color: '#f23b81' }}> Konaklama&Rezervasyon Paneli</h3>

        {/* ÜST MENÜ (GERİ AL/ KAYDET)*/}
        <div style={{ marginBottom: '15px' }}>
          <button style={{ marginRight: '10px', padding: '6px 12px', background: '#f23b81', color: '#fff', border: 'none', borderRadius: '4px' }}>
            Dosyaya Kaydet
          </button>
          <button
            type='button'
            onClick={geriAl}
            style={{ padding: '6px 12px', background: '#ef4444', color: '#fff', border: 'none', borderRadius: '4px', cursor: 'pointer', fontWeight: 'bold' }}>
            Geri Al
          </button>
        </div>

        {/*REZERVASYON EKLEME FORMU*/}
        <form onSubmit={rezervasyonYap}>
          <div style={{ marginBottom: '10px' }}>
            <label>
              Müşteri Ad/Soyad:
            </label>
            <input
              type='text'
              value={musteriAdi}
              onChange={(e) => setMusteriAdi(e.target.value)}
              placeholder='Adınızı Giriniz'
              style={{ padding: '6px', marginLeft: '10px', borderRadius: '4px', border: '1px solid #cbd5e1' }} />
            <button type='submit' style={{ padding: '6px 14px', background: '#f23b81', color: '#fff', border: 'none', borderRadius: '4px', fontWeight: 'bold' }}>
              Kaydet
            </button>
          </div>
        </form>

        {/* AKTİF REZERVASYON LİSTESİ*/}
        <div style={{ marginTop: '15px', padding: '10px', background: '#fff', borderRadius: '6px', border: '1px solid #e2e8f0' }}>
          <h4 style={{ margin: '0 0 8px 0', color: '#334155' }}>Aktif Rezervasyon Yığını (Stack):</h4>
          {rezervasyonlar.length === 0 ? (
            <p style={{ color: '#94a3b8', margin: 0, fontSize: '14px' }}>Eklenen rezervasyon yok</p>
          ) : (
            <ul style={{ margin: 0, paddingLeft: '20px' }}>{rezervasyonlar.map((rez, index) => (
              <li key={index} style={{ fontSize: '14px', color: '#1e293b' }}> {rez} </li>
            ))}
            </ul>
          )}
        </div>
      </div >
    </div >
  );
}
export default App