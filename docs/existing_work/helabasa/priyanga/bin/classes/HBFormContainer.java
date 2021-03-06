 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   H B F o r m C o n t a i n e r   {  
  
 	 p r i v a t e   M a p < I n t e g e r ,   M a p < I n t e g e r ,   L i s t < H B F o r m > > >   m a p _ F o r m L i s t G r o u p   =   n e w   H a s h M a p < I n t e g e r ,   M a p < I n t e g e r ,   L i s t < H B F o r m > > > ( ) ;  
 	 p r i v a t e   l o n g   l _ S c o r e   =   0 ;  
 	  
 	 p u b l i c   H B F o r m C o n t a i n e r ( )   {  
 	 	 l _ S c o r e   =   0 ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d F o r m ( i n t   i T y p e ,   i n t   i S u b T y p e ,   H B F o r m   o F o r m )  
 	 {  
 	 	 / / H e l a b a s a . o _ L o g . p r i n t l n ( " A d d F o r m   :   "   +   i T y p e   +   "   :   "   +   i S u b T y p e   +   "   =   "   +   o F o r m . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 I n t e g e r   o T y p e   =   n e w   I n t e g e r ( i T y p e ) ;  
 	 	 M a p < I n t e g e r ,   L i s t < H B F o r m > >   m a p F o r m L i s t   =   m a p _ F o r m L i s t G r o u p . g e t ( o T y p e ) ;  
 	 	 i f ( m a p F o r m L i s t = = n u l l )  
 	 	 {  
 	 	 	 m a p F o r m L i s t   =   n e w   H a s h M a p < I n t e g e r ,   L i s t < H B F o r m > > ( ) ;  
 	 	 	 m a p _ F o r m L i s t G r o u p . p u t ( o T y p e ,   m a p F o r m L i s t ) ;  
 	 	 }  
 	  
 	 	 I n t e g e r   o S u b T y p e   =   n e w   I n t e g e r ( i S u b T y p e ) ;  
 	 	 L i s t < H B F o r m >   l s t F o r m s   =   m a p F o r m L i s t . g e t ( o S u b T y p e ) ;  
 	 	  
 	 	 i f ( l s t F o r m s = = n u l l )  
 	 	 {  
 	 	 	 l s t F o r m s   =   n e w   A r r a y L i s t < H B F o r m > ( ) ;  
 	 	 	 m a p F o r m L i s t . p u t ( o S u b T y p e ,   l s t F o r m s ) ;  
 	 	 }  
 	 	 l s t F o r m s . a d d ( o F o r m ) ;  
 	 	 l _ S c o r e   + =   o F o r m . G e t W o r d ( ) . G e t F r e q u e n c y ( ) ;  
 	 }  
 	  
 	 p u b l i c   L i s t < H B F o r m >   G e t F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 I n t e g e r   o T y p e   =   n e w   I n t e g e r ( i T y p e ) ;  
 	 	  
 	 	 M a p < I n t e g e r ,   L i s t < H B F o r m > >   m a p F o r m L i s t   =   m a p _ F o r m L i s t G r o u p . g e t ( o T y p e ) ;  
 	 	 i f ( m a p F o r m L i s t = = n u l l )  
 	 	 {  
 	 	 	 / / H e l a b a s a . o _ L o g . p r i n t l n ( " G e t F o r m s   :   "   +   i T y p e   +   "   :   "   +   i S u b T y p e   +   "   =   N U L L   + + +   " ) ;  
 	 	 	 r e t u r n   n u l l ;  
 	 	 } 	 	  
 	 	  
 	 	 I n t e g e r   o S u b T y p e   =   n e w   I n t e g e r ( i S u b T y p e ) ;  
 	 	 L i s t < H B F o r m >   l s t F o r m s   =   m a p F o r m L i s t . g e t ( o S u b T y p e ) ;  
 	 	  
 	 	 i f ( l s t F o r m s = = n u l l )  
 	 	 {  
 	 	 	 / / H e l a b a s a . o _ L o g . p r i n t l n ( " G e t F o r m s   :   "   +   i T y p e   +   "   :   "   +   i S u b T y p e   +   "   =   L I S T _ N U L L   + + +   " ) ;  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / H e l a b a s a . o _ L o g . p r i n t l n ( " G e t F o r m s   :   "   +   i T y p e   +   "   :   "   +   i S u b T y p e   +   "   =   V A L I D   + + +   " ) ;  
 	 	 	 r e t u r n   l s t F o r m s ;  
 	 	 }  
 	 }  
 	  
 	  
 	 p u b l i c   L i s t < H B F o r m >   G e t A l l F o r m s ( )  
 	 { 	 	  
 	 	 L i s t < H B F o r m >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B F o r m > ( ) ;  
 	 	  
 	 	 f o r   ( M a p < I n t e g e r ,   L i s t < H B F o r m > >   m a p F o r m s   :   m a p _ F o r m L i s t G r o u p . v a l u e s ( ) )    
 	 	 {  
 	 	 	 f o r   ( L i s t < H B F o r m >   l i s t T F o r m s   :   m a p F o r m s . v a l u e s ( ) )    
 	 	 	 {  
 	 	 	 	 i n t   i C o u n t   =   l i s t T F o r m s . s i z e ( ) ;  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 l i s t F o r m s . a d d ( l i s t T F o r m s . g e t ( i ) ) ;  
 	 	 	 	 }  
 	 	 	 } 	  
 	 	 }  
 	 	  
 	 	 r e t u r n   l i s t F o r m s ; 	 	  
 	 } 	  
  
 	 p u b l i c   l o n g   G e t S c o r e ( )  
 	 {  
 	 	 r e t u r n   l _ S c o r e ;  
 	 }  
 }  
