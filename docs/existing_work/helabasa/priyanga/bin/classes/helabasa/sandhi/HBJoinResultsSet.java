 p a c k a g e   h e l a b a s a . s a n d h i ;  
  
 i m p o r t   h e l a b a s a . H B W o r d ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B J o i n R e s u l t s S e t   {  
  
 	 p r i v a t e   L i s t < H B J o i n R e s u l t s >   l i s t _ R e s u l t s   =   n e w   A r r a y L i s t < H B J o i n R e s u l t s > ( ) ;  
 	  
 	 p u b l i c   H B J o i n R e s u l t s S e t ( )    
 	 {  
 	 	  
 	 }  
  
 	 p u b l i c   v o i d   A d d ( H B J o i n R e s u l t s   r e s u l t )  
 	 {  
 	 	 l i s t _ R e s u l t s . a d d ( r e s u l t ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d ( H B W o r d   o L e f t ,   H B W o r d   o R i g h t ,   H B W o r d   o R e s u l t ,   i n t   i J o i n M e t h o d )  
 	 {  
 	 	 H B J o i n R e s u l t s   r e s u l t   =   n e w   H B J o i n R e s u l t s ( o L e f t ,   o R i g h t ,   o R e s u l t ,   i J o i n M e t h o d ) ;  
 	 	 l i s t _ R e s u l t s . a d d ( r e s u l t ) ;  
 	 } 	  
 	  
 	 p u b l i c   i n t   G e t R e s u l t s C o u n t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 }  
 	  
 	 p u b l i c   H B J o i n R e s u l t s   G e t R e s u l t s A t ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   l i s t _ R e s u l t s . g e t ( i P o s ) ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t R e s u l t s C o u n t ( i n t   i M e t h o d )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 	 i n t   i M e t h o d C o u n t   =   0 ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t   =   l i s t _ R e s u l t s . g e t ( i ) ;  
 	 	 	 i f ( r e s u l t . G e t J o i n M e t h o d ( ) = = i M e t h o d )  
 	 	 	 {  
 	 	 	 	 i M e t h o d C o u n t + + ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   i M e t h o d C o u n t ;  
 	 }  
 	  
 	 p u b l i c   H B J o i n R e s u l t s   G e t R e s u l t s A t ( i n t   i M e t h o d ,   i n t   i P o s )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 	 i n t   i M e t h o d C o u n t   =   0 ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t   =   l i s t _ R e s u l t s . g e t ( i ) ;  
 	 	 	 i f ( r e s u l t . G e t J o i n M e t h o d ( ) = = i M e t h o d )  
 	 	 	 {  
 	 	 	 	 i f ( i P o s = = i M e t h o d C o u n t )  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   r e s u l t ;  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 i M e t h o d C o u n t + + ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 } 	  
 	  
 	 p u b l i c   H B J o i n R e s u l t s   G e t B e s t R e s u l t s ( )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 	 l o n g   l S c o r e   =   - 1 ;  
 	 	 i n t   i M a x I n d e x   =   - 1 ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t   =   l i s t _ R e s u l t s . g e t ( i ) ;  
 	 	 	  
 	 	 	 i f ( r e s u l t . G e t S c o r e ( )   >   l S c o r e )  
 	 	 	 {  
 	 	 	 	 i M a x I n d e x   =   i ;  
 	 	 	 	 l S c o r e   =   r e s u l t . G e t S c o r e ( ) ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 i f ( i M a x I n d e x > = 0 )  
 	 	 {  
 	 	 	 r e t u r n   l i s t _ R e s u l t s . g e t ( i M a x I n d e x ) ;  
 	 	 }  
 	 	 e l s e 	 	  
 	 	 	 r e t u r n   n u l l ; 	  
 	 }  
 	  
 	  
 	 p u b l i c   v o i d   G e t A l l R e s u l t s ( L i s t < H B W o r d >   o W o r d s L i s t )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t   =   l i s t _ R e s u l t s . g e t ( i ) ;  
 	 	 	 o W o r d s L i s t . a d d ( r e s u l t . G e t R e s u l t ( ) ) ;  
 	 	 } 	 	  
 	 }  
  
 	 p u b l i c   v o i d   G e t A l l R e s u l t s ( L i s t < H B W o r d >   o W o r d s L i s t ,   l o n g   l T h r e s h o l d )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t   =   l i s t _ R e s u l t s . g e t ( i ) ;  
 	 	 	 i f ( r e s u l t . G e t S c o r e ( )   > =   l T h r e s h o l d )  
 	 	 	 {  
 	 	 	 	 o W o r d s L i s t . a d d ( r e s u l t . G e t R e s u l t ( ) ) ;  
 	 	 	 }  
 	 	 } 	 	  
 	 } 	 	  
 	  
 	 p u b l i c   v o i d   G e t A l l P o s i t i v e R e s u l t s ( L i s t < H B W o r d >   o W o r d s L i s t )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R e s u l t s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B J o i n R e s u l t s   r e s u l t   =   l i s t _ R e s u l t s . g e t ( i ) ;  
 	 	 	 i f ( r e s u l t . G e t S c o r e ( )   >   0 )  
 	 	 	 {  
 	 	 	 	 o W o r d s L i s t . a d d ( r e s u l t . G e t R e s u l t ( ) ) ;  
 	 	 	 }  
 	 	 } 	 	  
 	 } 	  
 }  
